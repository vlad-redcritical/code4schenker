import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'

// Custom Components
import Driver from './views/Driver';
import Customer from './views/Customer';

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [{
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/driver',
      name: 'driver',
      component: Driver
    },
    {
      path: '/customer',
      name: 'customer',
      component: Customer
    }
  ]
})