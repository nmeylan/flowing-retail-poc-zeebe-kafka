# Flowing Retail / Apache Kafka / Zeebe / Java

This is working a PoC extracted from: https://github.com/berndruecker/flowing-retail (https://github.com/berndruecker/flowing-retail/tree/master/kafka/java)

# Build
All images provided by https://github.com/berndruecker/flowing-retail are working out of the box, except: order-zeebe.

```
cd order-zeebe
mvn clean install
docker build . -t flowingretail/kafka-java-order-zeebe
```

# Deploy
`docker-compose up`

## Exposed service
- Zeebe monitor: http://localhost:8082/
- Kafka: localhost:9092
- Camunda operate: http://localhost:8080/#/login (demo/demo)
- Checkout Microservice: http://localhost:8091/
- Kafka events monitoring: http://localhost:8095/
- Elasticsearch: http://localhost:9200

## Getting started
http://localhost:8091/
