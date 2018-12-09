<template>
    <div class="alerts-list">
        <b-alert v-if="getAlert" :key="getAlert.ID" :variant="getAlert.variant" show dismissible @dismiss="removeAlert">
            <div v-html="getAlert.message"></div>
        </b-alert>
    </div>
</template>

<script>
    import {mapGetters} from 'vuex';

    export default {
        name: 'Alerts',
        methods: {
            removeAlert() {
                this.$store.commit('removeAlert');
            }
        },
        computed: {
            ...mapGetters(['getAlert']),
        }
    }
</script>