<template>
  <b-navbar toggleable>
    <b-navbar-toggle target="nav_dropdown_collapse"></b-navbar-toggle>
    <b-collapse is-nav id="nav_dropdown_collapse">
      <b-navbar-brand>
        <router-link class="logo" :to="{name: 'home'}">
          #Code
          <span class="number">4</span>
          Schenker
        </router-link>
      </b-navbar-brand>

      <b-navbar-nav class="ml-auto">
        <b-nav-item>
          <router-link :to="{name: 'driver'}">Driver View</router-link>
        </b-nav-item>
        <b-nav-item>
          <router-link :to="{name: 'customer'}">Customer Customer</router-link>
        </b-nav-item>
      </b-navbar-nav>
    </b-collapse>
  </b-navbar>
</template>
