FROM java:8-jre
MAINTAINER Andy <ducanh54@gmail.com>

ADD ./target/discovery-service-v1.0.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/discovery-service-v1.0.jar"]

EXPOSE 8761