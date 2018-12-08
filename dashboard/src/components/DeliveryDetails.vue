<template>
  <b-card header="Delivery info">
    <ul class="list-unstyled">
      <li>Speed: {{speed}}</li>
      <li>Angle: {{angle}}</li>
      <li>Weight: {{weight}}</li>
      <li>Pressure: {{pressure}}</li>
      <li>Shakes: {{shakes}}</li>
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

