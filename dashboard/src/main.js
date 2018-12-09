// Vue
import Vue from 'vue';
import App from './App.vue';
import store from './store';
import router from './router';

// Vue Imports
import moment from 'moment'
import Trend from 'vuetrend';
import BootstrapVue from 'bootstrap-vue';
import VueGoogleCharts from 'vue-google-charts'
import * as VueGoogleMaps from 'vue2-google-maps';

// Styles
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import './assets/scss/main.scss';

// Vue Use
Vue.config.productionTip = false;
Vue.prototype.moment = moment;

Vue.use(Trend);
Vue.use(BootstrapVue);

Vue.use(VueGoogleCharts);
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