// Cliente HTTP común: añade el token JWT y convierte la respuesta a JSON
export async function http(url, options = {}) {
  const token = localStorage.getItem('token')
  const res = await fetch(url, {
    ...options,
    headers: {
      'Content-Type': 'application/json',
      ...(token ? { Authorization: `Bearer ${token}` } : {}),
      ...options.headers
    }
  })
  if (!res.ok) throw new Error(`Error ${res.status}`)
  return res.status === 204 ? null : res.json()
}
