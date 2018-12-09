<template>
    <GmapMap
            :center="center"
            :zoom="7"
            map-type-id="terrain"
            style="width: 100%; height: 450px;"
    >
        <GmapPolyline :path="path" :editable="false"/>

        <gmap-custom-marker :marker="currentPosition">
            <img src="../assets/truck.png" alt="DB Truck">
        </gmap-custom-marker>


        <gmap-custom-marker :key="index" v-for="(m,index) in markers" :marker="m.position">
            <div class="details" :class="{recordDetails: m.display}" style="width: 200px; position: relative; bottom: 20px; opacity: 0;" v-html="m.status"></div>
            <div class="circle success-bg" @click="m.display = !m.display"></div>
        </gmap-custom-marker>

        <!--<GmapMarker v-for="(m, index) in markers" :key="index" :position="m.position" :clickable="true"-->
                    <!--:draggable="false" @click="toggleInfoWindow(m, index)"/>-->

        <!--<gmap-info-window class="sample-class" :options="infoOptions" :position="infoWindowPos" :opened="infoWinOpen"-->
                          <!--@closeclick="infoWinOpen=false">-->
            <!--<div v-html="infoContent"></div>-->
        <!--</gmap-info-window>-->

    </GmapMap>
</template>

<script>
    import json from '../assets/route';
    import {gmapApi} from "vue2-google-maps";
    import GmapCustomMarker from 'vue2-gmap-custom-marker';

    export default {
        name: "Map",
        data() {
            return {
                status: null,
                center: {
                    "lng": -88.441057,
                    "lat": 41.09381
                },
                currentPosition: {
                    "lng": -88.441057,
                    "lat": 41.09381
                },
                infoContent: '',
                infoWindowPos: null,
                infoWinOpen: false,
                currentMidx: null,
                infoOptions: {
                    pixelOffset: {
                        width: 0,
                        height: -35
                    }
                },
                path: json,
                markers: [
                    {
                        position: {lng: -87.619, lat: 41.87},
                        display: false,
                        status: `<ul class="list-group">
                                              <li class="list-group-item d-flex justify-content-between dark-blue-bg white">Speed: <span>100</span></li>
                                              <li class="list-group-item d-flex justify-content-between">Angle: <span>100</span></li>
                                              <li class="list-group-item d-flex justify-content-between">Weight: <span>100</span></li>
                                              <li class="list-group-item d-flex justify-content-between">Pressure: <span>100</span></li>
                                              <li class="list-group-item d-flex justify-content-between">Shakes: <span>100</span></li>
                                            </ul>`
                    },
                    {
                        position: {
                            "lng": -87.938166,
                            "lat": 41.746684
                        },
                        display: false,
                        status: `<ul class="list-group">
                                              <li class="list-group-item d-flex justify-content-between dark-blue-bg white">Speed: <span>300</span></li>
                                              <li class="list-group-item d-flex justify-content-between">Angle: <span>100</span></li>
                                              <li class="list-group-item d-flex justify-content-between">Weight: <span>100</span></li>
                                              <li class="list-group-item d-flex justify-content-between">Pressure: <span>100</span></li>
                                              <li class="list-group-item d-flex justify-content-between">Shakes: <span>100</span></li>
                                            </ul>`
                    },
                ]
            };
        },
        methods: {
            toggleInfoWindow: function (marker, idx) {
                this.infoWindowPos = marker.position;
                this.infoContent = marker.status;

                this.center = marker.position;

                //check if its the same marker that was selected if yes toggle
                if (this.currentMidx == idx) {
                    this.infoWinOpen = !this.infoWinOpen;
                }
                //if different marker set infowindow to open and reset current marker index
                else {
                    this.infoWinOpen = true;
                    this.currentMidx = idx;

                }
            }
        },
        computed: {
            google: gmapApi
        },
        components: {
            'gmap-custom-marker': GmapCustomMarker
        }
    };
</script>
