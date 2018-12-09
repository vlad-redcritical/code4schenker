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
        <router-link class="nav-item" :to="{name: 'driver'}">Driver Board</router-link>
        <router-link class="nav-item" :to="{name: 'customer'}">Customer Board</router-link>
      </b-navbar-nav>
    </b-collapse>
  </b-navbar>
</template>
