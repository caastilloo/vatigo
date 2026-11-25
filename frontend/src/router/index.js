import { createRouter, createWebHistory } from 'vue-router'
import MapaView from '../views/MapaView.vue'

// Rutas de la aplicación. meta.auth = requiere sesión, meta.admin = solo administradores
const routes = [
  { path: '/', name: 'mapa', component: MapaView },
  { path: '/gasolinera/:id', name: 'ficha', component: () => import('../views/FichaView.vue') },
  { path: '/luz', name: 'luz', component: () => import('../views/LuzView.vue') },
  { path: '/login', name: 'login', component: () => import('../views/LoginView.vue') },
  { path: '/panel', name: 'panel', component: () => import('../views/PanelView.vue'), meta: { auth: true } },
  { path: '/alertas', name: 'alertas', component: () => import('../views/AlertasView.vue'), meta: { auth: true } },
  { path: '/admin', name: 'admin', component: () => import('../views/AdminView.vue'), meta: { auth: true, admin: true } }
]

const router = createRouter({ history: createWebHistory(), routes })

// TODO: guard que redirija a /login si la ruta necesita sesión
export default router
