import { http } from './http'

// CRUD de alertas del usuario
export const listarAlertas = () => http('/api/alertas')
export const crearAlerta = (alerta) => http('/api/alertas', { method: 'POST', body: JSON.stringify(alerta) })
export const borrarAlerta = (id) => http(`/api/alertas/${id}`, { method: 'DELETE' })
