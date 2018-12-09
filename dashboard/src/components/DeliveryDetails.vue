<template>
  <b-card v-if="details" header="Current details">
    <ul class="list-group">
        <li class="list-group-item d-flex justify-content-between" v-for="(detail, index) in details" :key="index">
            {{detail.deliveryParamDto.paramName}}: <span>{{detail.deliveryParamDto.currentValue}} {{detail.deliveryParamDto.paramUnit}}</span>
        </li>
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

        computed: {
            details() {
                return this.$store.getters.getDetails
            }
        }
    };
</script>