<!-- Componente raíz: barra de navegación y la vista de la ruta actual -->
<script setup>
import NavBar from './components/NavBar.vue'
</script>

<template>
  <NavBar />
  <main>
    <RouterView />
  </main>
</template>
