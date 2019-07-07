FROM hub.test.com/micro-service/java:8-jre
MAINTAINER developerName xxx@163.com

COPY target/user-edge-service-1.0-SNAPSHOT.jar /user-edge-service.jar

ENTRYPOINT ["java", "-jar", "/user-edge-service.jar"]