FROM hub.test.com/micro-service/java:8-jre
MAINTAINER developerName xxx@163.com

COPY target/api-gateway-zuul-1.0-SNAPSHOT.jar /api-gateway-zuul.jar

ENTRYPOINT ["java", "-jar", "/api-gateway-zuul.jar"]
