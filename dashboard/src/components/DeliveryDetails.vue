<template>
  <b-card header="Current details">
    <ul class="list-group">
      <li class="danger list-group-item d-flex justify-content-between">Speed: <span>{{speed}}</span></li>
      <li class="list-group-item d-flex justify-content-between">Angle: <span>{{angle}}</span></li>
      <li class="list-group-item d-flex justify-content-between">Weight: <span>{{weight}}</span></li>
      <li class="warning list-group-item d-flex justify-content-between">Pressure: <span>{{pressure}}</span></li>
      <li class="list-group-item d-flex justify-content-between">Shakes: <span>{{shakes}}</span></li>
    </ul>
  </b-card>
</template>

<script>
export default {
  name: "DeliveryDetails",
  data() {
    return {
      speed: 100,
      weight: 300,
      angle: 3.2,
      pressure: 100,
      shakes: 100
    };
  }
};
</script>