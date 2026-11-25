import { defineStore } from 'pinia'

// Filtros del mapa compartidos entre el listado y el mapa
export const useFiltrosStore = defineStore('filtros', {
  state: () => ({ combustible: 'DIESEL', radioKm: 6, orden: 'precio' })
})
