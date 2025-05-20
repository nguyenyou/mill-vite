import { defineConfig } from 'vite'

const base = process.env.CI ? '/mill-vite/' : '/'

export default defineConfig({
  base,
})
