#!/usr/bin/env bash
mvn clean package

docker build -t hub.test.com/micro-service/user-edge-service:latest .
docker push hub.test.com/micro-service/user-edge-service:latest