#!/usr/bin/env bash

mvn package

docker build -t hub.test.com/micro-service/api-gateway-zuul:latest .

docker push hub.test.com/micro-service/api-gateway-zuul:latest