FROM java:8-jre
MAINTAINER Andy <ducanh54@gmail.com>

ADD ./target/auth-service-v1.0.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/auth-service-v1.0.jar"]

EXPOSE 5000