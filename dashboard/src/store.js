import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        alerts: []
    },
    getters: {
        getAlerts: state => {
            return state.alerts;
        }
    },
    mutations: {
        addAlerts: (state, payLoad) => {
            const alert = {
                ID: Date.now(),
                message: payLoad.message || 'Something went wrong'
            };

            state.alerts.push(alert);
        }
    },
})
