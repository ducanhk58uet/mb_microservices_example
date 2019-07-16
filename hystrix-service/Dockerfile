FROM java:8-jre
MAINTAINER Andy <ducanh54@gmail.com.com>

ADD ./target/hystrix-service-v1.0.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/hystrix-service-v1.0.jar"]

EXPOSE 9000