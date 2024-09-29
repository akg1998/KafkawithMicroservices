FROM openjdk:17-oracle

WORKDIR /app

COPY target/docker_jar_deliveryBoyApp.jar /app/

EXPOSE 8080

# Command to run the microservice
CMD ["java", "-jar", "docker_jar_deliveryBoyApp.jar"]