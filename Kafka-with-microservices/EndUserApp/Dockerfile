FROM openjdk:17-oracle

WORKDIR /app

COPY target/docker_jar_endUserApp.jar /app/

EXPOSE 8081

# Command to run the microservice
CMD ["java", "-jar", "docker_jar_endUserApp.jar"]