<template>
  <div class="map-details-view">
    <b-row>
      <b-col cols="9">
        <Map/>
      </b-col>
      <b-col cols="3">
        <DeliveryDetails/>
      </b-col>
    </b-row>
  </div>
</template>

<script>
import Map from "../components/Map.vue";
import DeliveryDetails from "../components/DeliveryDetails.vue";

export default {
  name: "Driver",
  components: {
    Map,
    DeliveryDetails
  }
};
</script>
