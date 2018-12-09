<template>
    <b-container id="app">
        <Header/>
        <Alerts v-if="!this.$route.name === 'customer'"/>
        <router-view></router-view>
    </b-container>
</template>

<script>
    import Alerts from './components/Alerts';
    import Header from "./components/Header.vue";

    export default {
        name: "app",
        components: {
            Header,
            Alerts
        }
    };
</script>