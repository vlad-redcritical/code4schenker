<template>
    <GmapMap
            :center="center"
            :zoom="7"
            :options="mapOptions"
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
            <div class="circle info-bg" @click="m.display = !m.display" style="position: relative; top: 10px;"></div>
        </gmap-custom-marker>
    </GmapMap>
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
                mapOptions: {
                    disableDefaultUI : true
                }
            };
        },
        computed: {
            google: gmapApi
        },
        components: {
            'gmap-custom-marker': GmapCustomMarker
        },
        methods: {
            setMarker(marker) {
                let output = `<ul class="list-group">`;
                output = output + `<li style="background-color: darkblue; color: white;" class="text-center list-group-item d-flex justify-content-center">${moment(marker.timestamp).format('YYYY-MM-DD HH:mm')}</li>`;
                marker.paramLogDtos.forEach(element => {
                    const {deliveryParamDto} = element;

                    let status = (deliveryParamDto.currentValue > deliveryParamDto.maxValue * 0.8 || deliveryParamDto.currentValue < deliveryParamDto.minValue * 0.8) ? 'warning' : 'success';

                    if (status !== 'success') {
                        status = (deliveryParamDto.currentValue > deliveryParamDto.maxValue || deliveryParamDto.currentValue < deliveryParamDto.minValue) ? 'danger' : 'warning';
                    }

                    output = output + `<li class="list-group-item d-flex justify-content-between ${status}">${element.deliveryParamDto.paramName}: <span>${element.deliveryParamDto.currentValue} ${element.deliveryParamDto.paramUnit}</span></li>`
                });
                output = output + `</ul>`;

                return {
                    status: output,
                    display: false,
                    position: marker.position
                }
            },
            getRecords() {
                let recordID = 13;
                this.timer = setInterval(() => {
                        axios.get(`${process.env.VUE_APP_API_URL}details/${recordID}`)
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
                            console.log(error);
                            clearInterval(this.timer);
                        });

                        recordID = recordID + 1;
                    }
                    , 3000);
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
