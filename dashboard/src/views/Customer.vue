<template>
  <div class="driver">
    <b-row>
      <b-col cols="8">
        <Map/>
      </b-col>
      <b-col cols="4">
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
