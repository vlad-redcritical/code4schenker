<template>
    <GmapMap
            :center="center"
            :zoom="10"
            map-type-id="terrain"
            style="width: 100%; height: 400px;"
    >
        <GmapPolyline :path="path" :editable="false"/>
        <!--<GmapMarker v-for="(m, index) in markers" :key="index" :position="m.position" :clickable="true"-->
                    <!--:draggable="false" @click="center = m.position" @mouseover="status = m.status"-->
                    <!--@mouseout="status = null"/>-->

        <div slot="visible" v-if="status">
            <div class="map-info" v-html="status">

            </div>
        </div>
    </GmapMap>
</template>

<script>
    import json from '../assets/route';
    import {gmapApi} from "vue2-google-maps";

    export default {
        name: "Map",
        data() {
            return {
                status: null,
                center: {lng: -87.619, lat: 41.87},
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
                        position: {
                            lat: 52,
                            lng: 21
                        },
                        status: `Speed: 100 <br />
                        Weight: 200<br />
                        Temperatue: 30`
                    },
                    {
                        position: {
                            lat: 52.14,
                            lng: 21.04
                        },
                        status: `<ul class="list-unstyled">
                                    <li>Speed: 50 km/h</li>
                                    <li>Angle: 1 &deg;</li>
                                    <li>Weight: 1000 kg</li>
                                    <li>Pressure: 1000 &deg;</li>
                                    <li>Temperature: 30 &deg;</li>
                                </ul>`
                    },
                    {
                        position: {
                            lat: 52.14,
                            lng: 21.15
                        },
                        status: 'some other text'
                    },
                ]
            };
        },
        computed: {
            google: gmapApi
        },
    };
</script>
