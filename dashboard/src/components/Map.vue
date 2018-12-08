<template>
    <GmapMap
            :center="center"
            :zoom="10"
            map-type-id="terrain"
            style="width: 100%; height: 400px;"
    >
        <GmapPolyline :path="path" :editable="false"/>
        <GmapMarker v-for="(m, index) in markers" :key="index" :position="m.position" :clickable="true"
                    :draggable="false" @click="center = m.position" @mouseover="toggleInfoWindow(m, index)"
                    @mouseout="infoWinOpen=false"/>
        <gmap-info-window class="sample-class" :options="infoOptions" :position="infoWindowPos" :opened="infoWinOpen"
                          @closeclick="infoWinOpen=false">
            <div v-html="infoContent"></div>
        </gmap-info-window>
        <gmap-custom-marker :marker="center">
            <img src="https://i.imgur.com/Zdl7JQe.png" alt="">
        </gmap-custom-marker>
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
                        "lng": -87.938166,
                        "lat": 41.746684
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
                        status: `<ul class="list-unstyled">
                                    <li>Speed: 50 km/h</li>
                                    <li>Angle: 1 &deg;</li>
                                    <li>Weight: 1000 kg</li>
                                    <li>Pressure: 1000 &deg;</li>
                                    <li>Temperature: 30 &deg;</li>
                                </ul>`
                    },
                ]
            };
        },
        methods: {
            toggleInfoWindow: function (marker, idx) {
                this.infoWindowPos = marker.position;
                this.infoContent = marker.status;

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
