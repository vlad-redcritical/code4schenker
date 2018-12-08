<template>
  <GmapMap
    :center="centerLocation"
    :zoom="10"
    map-type-id="terrain"
    style="width: 100%; height: 400px;"
  >
    <GmapPolyline :path="markers" :editable="false"/>
    <!-- <GmapMarker v-for="(m, index) in markers" :key="index" :position="m" :clickable="true" :draggable="false" @click="centerLocation=m"/> -->
  </GmapMap>
</template>

<script>
import { gmapApi } from "vue2-google-maps";

export default {
  name: "Map",
  data() {
    return {
      centerLocation: { lat: 52.14, lng: 21.14 },
      markers: [
        {
          lat: 52,
          lng: 21
        },
        { lat: 52.14, lng: 21.04 },
        { lat: 52.14, lng: 21.14 },
        { lat: 52.14, lng: 21.24 },
        { lat: 52.14, lng: 21.31 },
        { lat: 52.14, lng: 21.41 },
        { lat: 52, lng: 21.41 },
        { lat: 52, lng: 21 },
      ]
    };
  },
  computed: {
    google: gmapApi
  }
};
</script>
