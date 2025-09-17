FROM alpine:3.18

RUN echo "hola desde GHCR" > /mensaje.txt

CMD ["cat", "/mensaje.txt"]