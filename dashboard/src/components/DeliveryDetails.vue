<template>
  <b-card header="Current details">
    <ul class="list-group">
      <li class="danger-bg list-group-item d-flex justify-content-between">Speed: <span>{{speed}}</span><img alt="" style="transform: rotate(45deg); width: 16px; height: 16px;" src="../assets/right-arrow-w.png"></li>
      <li class="list-group-item d-flex justify-content-between">Angle: <span>{{angle}}</span><img alt="" style="transform: rotate(0deg); width: 16px; height:16px;" src="../assets/right-arrow-db.png"></li>
      <li class="list-group-item d-flex justify-content-between">Weight: <span>{{weight}}</span><img alt="" style="transform: rotate(315deg); width: 16px; height: 16px;" src="../assets/right-arrow-db.png"></li>
      <li class="warning-bg list-group-item d-flex justify-content-between">Pressure: <span>{{pressure}}</span><img alt="" style="transform: rotate(45deg); width: 16px; height:16px;" src="../assets/right-arrow-w.png"></li>
      <li class="list-group-item d-flex justify-content-between">Shakes: <span>{{shakes}}</span><img alt="" style="transform: rotate(315deg); width: 16px; height: 16px;" src="../assets/right-arrow-db.png"></li>
    </ul>

    <div class="alert alert-warning">
      <strong>Warning!</strong> Min and Max for Temperature.
    </div>

    <div class="alert alert-danger">
      <strong>Danger!</strong> Min and Max for Temperature.
    </div>

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