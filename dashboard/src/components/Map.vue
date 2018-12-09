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
