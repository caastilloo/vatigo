import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// En desarrollo, las llamadas a /api se redirigen al backend de Spring Boot
export default defineConfig({
  plugins: [vue()],
  server: {
    proxy: { '/api': 'http://localhost:8080' }
  }
})
