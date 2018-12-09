// Vue
import Vue from 'vue';
import App from './App.vue';
import router from './router';
import store from './store';

// Vue Imports
import * as VueGoogleMaps from 'vue2-google-maps';
import BootstrapVue from 'bootstrap-vue';
import Trend from 'vuetrend';

// Styles
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import './assets/scss/main.scss';

// Vue Use
Vue.config.productionTip = false;

Vue.use(Trend);
Vue.use(BootstrapVue);
Vue.use(VueGoogleMaps, {
    load: {
        key: process.env.VUE_APP_GMAPS_API_KEY,
        libraries: 'places'
    },
});

new Vue({
    router,
    store,
    render: h => h(App)
}).$mount('#app');