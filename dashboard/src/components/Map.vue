<template>
    <div>
        <GmapMap
                :center="center"
                :zoom="7"
                map-type-id="terrain"
                style="width: 100%; height: 450px; border-style: solid; border-width: 1.5px; border-color: lightgray;"
        >
            <GmapPolyline :path="path" :editable="false"/>

            <gmap-custom-marker :marker="currentPosition">
                <img src="../assets/truck.png" alt="DB Truck">
            </gmap-custom-marker>

            <gmap-custom-marker :key="index" v-for="(m,index) in markers" :marker="m.position">
                <div class="details" :class="{recordDetails: m.display}"
                     style="width: 200px; position: relative; bottom: 20px; opacity: 0;" v-html="m.status"></div>
                <div :class="['circle', {'info-bg': m.boxColor.success}, {'warning-bg': m.boxColor.warning}, {'circle-danger-bg': m.boxColor.danger}]" @click="m.display = !m.display" style="position: relative; top: 10px;"></div>
            </gmap-custom-marker>
        </GmapMap>
        <b-btn class="w-100" @click="stopTimer">Start / Stop Simulation</b-btn>
    </div>
</template>

<script>
    import axios from 'axios';
    import moment from 'moment';
    import {gmapApi} from "vue2-google-maps";
    import GmapCustomMarker from 'vue2-gmap-custom-marker';

    export default {
        name: "Map",
        data() {
            return {
                recordID: 13,
                timer: null,
                status: null,
                center: {
                    lat: 0,
                    lng: 0
                },
                currentPosition: {
                    lat: 0,
                    lng: 0
                },
                path: [],
                markers: [],
            };
        },
        computed: {
            google: gmapApi
        },
        components: {
            'gmap-custom-marker': GmapCustomMarker
        },
        methods: {
            stopTimer() {
                if (this.timer) {
                    clearInterval(this.timer);
                    this.timer = null;
                } else {
                    this.getRecords();
                }
            },
            setMarker(marker) {
                let output = `<ul class="list-group">`;
                let status = {
                    success: true,
                    warning: false,
                    danger: false
                };
                output = output + `<li style="background-color: darkblue; color: white;" class="text-center list-group-item d-flex justify-content-center">${moment(marker.timestamp).format('YYYY-MM-DD HH:mm')}</li>`;
                marker.paramLogDtos.forEach(element => {
                    const {deliveryParamDto} = element;

                    status.warning = (deliveryParamDto.currentValue > deliveryParamDto.maxValue * 0.8 || deliveryParamDto.currentValue < deliveryParamDto.minValue * 1.2) ? true : false;

                    if (status.warning) {
                        status.danger = (deliveryParamDto.currentValue > deliveryParamDto.maxValue || deliveryParamDto.currentValue < deliveryParamDto.minValue) ? true : false;
                    }

                    if (status.danger) {
                        this.$store.commit('addAlerts', {
                            message: `${deliveryParamDto.paramName} went out of the limit`
                        });
                    } else if (status.warning) {
                        this.$store.commit('addAlerts', {
                            variant: 'warning',
                            message: `${deliveryParamDto.paramName} is close to the limit`
                        })
                    }

                    let color = 'success';
                    if (status.warning) {
                        color = 'warning';
                    }
                    if (status.danger) {
                        color = 'danger';
                    }

                    output = output + `<li class="list-group-item d-flex justify-content-between ${color}">${element.deliveryParamDto.paramName}: <span>${element.deliveryParamDto.currentValue} ${element.deliveryParamDto.paramUnit}</span></li>`
                });
                output = output + `</ul>`;

                return {
                    boxColor: status,
                    status: output,
                    display: false,
                    position: marker.position
                }
            },
            getRecords() {
                const time = this.$route.name === 'customer' ? 1000 : 5000;
                this.timer = setInterval(() => {
                        axios.get(`${process.env.VUE_APP_API_URL}details/${this.recordID}`)
                            .then(response => {
                                const responseData = response.data;

                                if (this.center.lat === 0) {
                                    this.center = responseData.position;
                                }

                                this.currentPosition = responseData.position;
                                this.path.push(responseData.position);


                                this.markers.push(this.setMarker(responseData));
                                this.$store.commit('addDetails', responseData.paramLogDtos);
                                this.$store.commit('setTimestamp', responseData.timestamp);
                            }).catch(error => {
                            // eslint-disable-next-line
                            console.log(error);
                            clearInterval(this.timer);
                        });

                        this.recordID = this.recordID + 1;
                    }
                    , time);
            }
        },
        mounted() {
            this.getRecords();
        },
        beforeDestroy() {
            clearInterval(this.timer);
        }
    };
</script>
