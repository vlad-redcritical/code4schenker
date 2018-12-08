<template>
    <GmapMap
            :center="center"
            :zoom="10"
            map-type-id="terrain"
            style="width: 100%; height: 400px;"
    >
        <!-- <GmapPolyline :path="markers" :editable="false"/> -->
        <GmapMarker v-for="(m, index) in markers" :key="index" :position="m.position" :clickable="true"
                    :draggable="false" @click="center = m.position" @mouseover="status = m.status" @mouseout="status = null"/>

        <div slot="visible" v-if="status">
            <div class="map-info" v-html="status">

            </div>
        </div>
    </GmapMap>
</template>

<script>
    import {gmapApi} from "vue2-google-maps";

    export default {
        name: "Map",
        data() {
            return {
                status: null,
                center: {lat: 52.14, lng: 21.14},
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
                        status: 'some other text'
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
        }
    };
</script>
