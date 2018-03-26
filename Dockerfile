FROM openjdk:8-jdk-alpine
MAINTAINER siddharthak024@gmail.com
COPY target\myretail-api-0.1.0.jar myretail-api-0.1.0.jar
CMD ["java", "-jar", "myretail-api-0.1.0.jar"]