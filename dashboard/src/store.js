import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        alerts: [],
        details: {}
    },
    getters: {
        getAlerts: state => {
            return state.alerts;
        },
        getDetails: state => {
            return state.details
        }
    },
    mutations: {
        addAlerts: (state, payLoad) => {
            const alert = {
                ID: Date.now(),
                message: payLoad.message || 'Something went wrong'
            };

            state.alerts.push(alert);
        },
        addDetails: (state, payLoad) => {
            state.details = payLoad
        }
    },
})
