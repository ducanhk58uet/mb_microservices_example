FROM java:8-jre
MAINTAINER Andy <ducanh54@gmail.com>

ADD ./target/account-service-v1.0.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/account-service-v1.0.jar"]

EXPOSE 6000