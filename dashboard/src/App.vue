<template>
    <b-container id="app">
        <Header/>
        <Alerts/>
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