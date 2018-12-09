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


        <!--<gmap-custom-marker :key="index" v-for="(m,index) in markers"  :marker="m.position">-->
            <!--<div class="details" :class="{recordDetails: m.display}"-->
                 <!--style="width: 200px; position: relative; bottom: 20px; opacity: 0;" v-html="m.status"></div>-->
            <!--<div class="circle info-bg" @click="m.display = !m.display" style="position: relative; top: 10px;"></div>-->
        <!--</gmap-custom-marker>-->
    </GmapMap>
</template>

<script>
    import axios from 'axios';
    import json from '../assets/route';
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
                // markers: [
                //     {
                //         position: {lng: -87.619, lat: 41.87},
                //         display: false,
                //         status: `<ul class="list-group">
                //                               <li class="list-group-item d-flex justify-content-between info-bg white">Speed: <span>100</span></li>
                //                               <li class="list-group-item d-flex justify-content-between">Angle: <span>100</span></li>
                //                               <li class="list-group-item d-flex justify-content-between">Weight: <span>100</span></li>
                //                               <li class="list-group-item d-flex justify-content-between">Pressure: <span>100</span></li>
                //                               <li class="list-group-item d-flex justify-content-between">Shakes: <span>100</span></li>
                //                             </ul>`
                //     },
                //     {
                //         position: {
                //             "lng": -87.938166,
                //             "lat": 41.746684
                //         },
                //         display: false,
                //         status: `<ul class="list-group">
                //                               <li class="list-group-item d-flex justify-content-between info-bg white">Speed: <span>300</span></li>
                //                               <li class="list-group-item d-flex justify-content-between">Angle: <span>100</span></li>
                //                               <li class="list-group-item d-flex justify-content-between">Weight: <span>100</span></li>
                //                               <li class="list-group-item d-flex justify-content-between">Pressure: <span>100</span></li>
                //                               <li class="list-group-item d-flex justify-content-between">Shakes: <span>100</span></li>
                //                             </ul>`
                //     },
                // ]
            };
        },
        computed: {
            google: gmapApi
        },
        components: {
            'gmap-custom-marker': GmapCustomMarker
        },
        mounted() {
            let recordID = 13;

            setInterval(() => {
                    axios.get(`${process.env.VUE_APP_API_URL}details/${recordID}`)
                        .then(response => {
                            const responseData = response.data;
                            this.currentPosition = responseData.position;
                            this.center = responseData.position;

                            this.path.push(responseData.position);
                        }).catch(error => {
                        console.log(error);
                    });

                    recordID = recordID + 1;
                }
               , 1000000);
        }
    };
</script>
