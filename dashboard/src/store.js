import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        alerts: [],
        details: {},
        timestamp: null
    },
    getters: {
        getAlerts: state => {
            return state.alerts;
        },
        getDetails: state => {
            return state.details
        },
        getTimestamp: state => {
            return state.timestamp;
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
        setTimestamp: (state, payLoad) => {
            state.timestamp = payLoad
        },
        addDetails: (state, payLoad) => {
            state.details = payLoad
        }
    },
})
