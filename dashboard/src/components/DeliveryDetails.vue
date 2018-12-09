<template>
    <div class="delivery-details">
        <span v-if="timestamp" class="d-flex justify-content-end timestamp">
            <span class="time">{{moment(timestamp).format('HH:mm')}}</span>
            <span class="date">{{moment(timestamp).format('DD-MM-YYYY')}}</span>
        </span>
        <b-card v-if="details" header="Current details">
            <ul class="list-group">
                <li class="list-group-item d-flex justify-content-between" v-for="(detail, index) in details"
                    :key="index">
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
    </div>
</template>

<script>
    export default {
        name: "DeliveryDetails",
        computed: {
            details() {
                return this.$store.getters.getDetails
            },
            timestamp() {
                return this.$store.getters.getTimestamp;
            }
        }
    };
</script>