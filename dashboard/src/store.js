import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        alert: null,
        details: {},
        timestamp: null
    },
    getters: {
        getAlert: state => {
            return state.alert;
        },
        getDetails: state => {
            if (state.details.length){
                const data = state.details.map(element => {
                    const value = element.deliveryParamDto;

                    let status = {
                        success: true,
                        warning: false,
                        danger: false
                    };

                    status.warning = (value.currentValue > value.maxValue * 0.8 || value.currentValue < value.minValue * 0.8) ? true : false;

                    if (status.warning) {
                        status.danger = (value.currentValue > value.maxValue || value.currentValue < value.minValue) ? true : false;
                    }

                    return {
                        status: status,
                        value: value.currentValue,
                        unit: value.paramUnit,
                        name: value.paramName
                    }
                });

                return data;
            }

            return '';
        },
        getTimestamp: state => {
            return state.timestamp;
        }
    },
    mutations: {
        addAlerts: (state, payLoad) => {
            const alert = {
                ID: Date.now(),
                variant: payLoad.variant || 'danger',
                message: payLoad.message || 'Something went wrong'
            };

            state.alert = alert;
        },
        setTimestamp: (state, payLoad) => {
            state.timestamp = payLoad
        },
        addDetails: (state, payLoad) => {
            state.details = payLoad
        },
        removeAlert: state => {
            state.alert = null;
        }
    },
})
