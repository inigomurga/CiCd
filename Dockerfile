From node:18-alpine

WORKDIR /app

COPY . .

CMD ["node", "-e", "console.log('Hola desde Docker')"]