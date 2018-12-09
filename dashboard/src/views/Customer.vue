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
    <b-row>
      <trend
              :data="[1, 2, 5, 9, 5, 10, 3, 5, 2, 5, 1, 8, 2, 9, 0,1, 2, 5, 9, 5, 10, 3, 5, 2, 5, 1, 8, 2, 9, 0,1, 2, 5, 9, 5, 10, 3, 5, 2, 5, 1, 8, 2, 9, 0,1, 2, 5, 9, 5, 10, 3, 5, 2, 5, 1, 8, 2, 9, 0,1, 2, 5, 9, 5, 10, 3, 5, 2, 5, 1, 8, 2, 9, 0,1, 2, 5, 9, 5, 10, 3, 5, 2, 5, 1, 8, 2, 9, 0,1, 2, 5, 9, 5, 10, 3, 5, 2, 5, 1, 8, 2, 9, 0]"
              :gradient="['#6fa8dc', '#42b983']">
      </trend>
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
