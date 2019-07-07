#!/usr/bin/env bash

mvn clean package

docker build -t hub.test.com/micro-service/course-service:latest .
docker push hub.test.com/micro-service/course-service:latest