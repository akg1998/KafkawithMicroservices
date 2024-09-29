# Microservices with Kafka for Location Sharing

## Overview

This project demonstrates a microservices architecture utilizing Apache Kafka to facilitate communication between two services: a Delivery Man Application and an End User Application. The primary functionality includes sending real-time location updates from the Delivery Man Application to the End User Application.

## Features

- **Microservices Architecture**: Built using Spring Boot for scalability and maintainability.
- **Kafka Integration**: Utilizes Apache Kafka for efficient and reliable messaging between microservices.
- **Real-time Location Updates**: Enables delivery personnel to send location data, which is then received by end users.

## Architecture

- **Delivery Man Application**: Responsible for capturing and sending the location data to Kafka.
- **End User Application**: Consumes the location data from Kafka and displays it to the end user.

## Technologies Used

- Java
- Spring Boot
- Apache Kafka
- Docker

## Getting Started

### Prerequisites

1. **Java 17 or higher**
2. **Apache Kafka**
3. **Docker and Docker Compose**

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/akg1998/KafkawithMicroservices.git
   cd Kafka-with-microservices
2. Using Docker Compose: If you want to use the existing project as-is, you need to run the following commands to bring up the services:
   ```bash
   docker-compose up -d
This command will automatically pull the necessary images defined in your docker-compose.yml file. Ensure that the images for the Delivery Man and End User applications are defined in the docker-compose.yml.

If you are not using Docker for Kafka, make sure you have it running locally or use a managed Kafka service.

Thank you!

