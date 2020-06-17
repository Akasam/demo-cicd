FROM node:9
WORKDIR /app
ADD . /app
EXPOSE 3000
CMD npm start
