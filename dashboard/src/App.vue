<template>
  <b-container id="app">
    <Header/>

    <router-view></router-view>
  </b-container>
</template>

<script>
import Header from "./components/Header.vue";

export default {
  name: "app",
  components: {
    Header
  }
};
</script>