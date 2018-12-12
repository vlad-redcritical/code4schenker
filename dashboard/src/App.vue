<template>
    <b-container id="app">
        <Header/>
        <Alerts v-if="this.$route.name === 'driver'"/>
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
        },
        mounted() {
            let SpeechRecognition = window.SpeechRecognition || window.webkitSpeechRecognition;
            let recognition = SpeechRecognition? new SpeechRecognition() : false;
            recognition.interimResults = true;

            recognition.addEventListener("result", e => {
                const transcription = Array.from(e.results).map(result => result[0]).map(result => result.transcript).join('');

                if (transcription.includes('display driver')) {
                    this.$router.push({name: 'driver'})
                }

                if (transcription.includes('display customer')) {
                    this.$router.push({name: 'customer'})
                }
            });

            recognition.addEventListener("end", recognition.start);

            recognition.start();
        }
    };
</script>