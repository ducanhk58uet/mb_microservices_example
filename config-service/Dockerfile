FROM java:8-jre
MAINTAINER Andy <ducanh54@gmail.com>

ADD ./target/config-service-v1.0.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config-service-v1.0.jar"]

HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:8888/actuator/health || exit 1

EXPOSE 8888