<template>
    <div class="alerts-list">
        <b-alert v-for="alert in getAlerts" :key="alert.ID" variant="danger" show dismissible>
            <div v-html="alert.message"></div>
        </b-alert>
    </div>
</template>

<script>
    import {mapGetters} from 'vuex';

    export default {
        name: 'Alerts',
        computed: {
            ...mapGetters(['getAlerts']),
        }
    }
</script>