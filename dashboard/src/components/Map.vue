<template>
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
            <div class="circle info-bg" @click="m.display = !m.display" style="position: relative; top: 10px;"></div>
        </gmap-custom-marker>
    </GmapMap>
</template>

<script>
    import axios from 'axios';
    import {gmapApi} from "vue2-google-maps";
    import GmapCustomMarker from 'vue2-gmap-custom-marker';

    export default {
        name: "Map",
        data() {
            return {
                status: null,
                center: {
                    lat: 0,
                    lng: 0
                },
                currentPosition: {},
                path: [],
                markers: []
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
                let status = `<ul class="list-group">`;
                marker.paramLogDtos.forEach(element => {
                    status = status + `<li class="list-group-item d-flex justify-content-between">${element.deliveryParamDto.paramName}: <span>${element.currentValue} ${element.deliveryParamDto.paramUnit}</span></li>`
                });
                status = status + `</ul>`;

                return {
                    position: marker.position,
                    display: false,
                    status: status
                }
            }
        },
        mounted() {
            let recordID = 13;

            let timer = setInterval(() => {
                    axios.get(`${process.env.VUE_APP_API_URL}details/${recordID}`)
                        .then(response => {
                            const responseData = response.data;

                            if (this.center.lat === 0) {
                                this.center = responseData.position;
                            }

                            this.currentPosition = responseData.position;
                            this.path.push(responseData.position);

                            this.markers.push(this.setMarker(responseData));
                        }).catch(() => {
                        clearInterval(timer);
                    });

                    recordID = recordID + 1;
                }
                , 10000);
        }
    };
</script>
