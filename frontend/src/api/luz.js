import { http } from './http'

// Precio de la luz por horas de un día (AAAA-MM-DD)
export const preciosLuz = (fecha) => http(`/api/luz?fecha=${fecha}`)
