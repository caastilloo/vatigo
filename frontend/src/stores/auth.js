import { defineStore } from 'pinia'

// Estado de la sesión: token y rol del usuario
export const useAuthStore = defineStore('auth', {
  state: () => ({ token: localStorage.getItem('token'), rol: localStorage.getItem('rol') }),
  getters: {
    logueado: (s) => !!s.token,
    esAdmin: (s) => s.rol === 'ADMIN'
  },
  actions: {
    // TODO: login(email, password), logout()
  }
})
