import { http } from './http'

// Llamadas al backend relacionadas con gasolineras
export const buscarCercanas = (lat, lng, radio, combustible) =>
  http(`/api/gasolineras?lat=${lat}&lng=${lng}&radio=${radio}&combustible=${combustible}`)

export const obtenerFicha = (id) => http(`/api/gasolineras/${id}`)

export const obtenerHistorico = (id, combustible) =>
  http(`/api/gasolineras/${id}/historico?combustible=${combustible}`)
