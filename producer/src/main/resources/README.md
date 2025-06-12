# Kafka Integration Service

This project is a Java Spring Boot application using Maven, designed to integrate with Apache Kafka.

## Features

- Implements both Kafka consumer and producer functionality
- Uses Spring Boot for rapid development and configuration
- Maven-based build and dependency management

## Prerequisites

- Java 17 or higher
- Maven 3.6+
- Apache Kafka running locally or accessible remotely

## Project Structure

- `src/main/java/` — Java source code (includes both consumer and producer logic)
- `src/main/resources/` — Application configuration files
- `kafka/` — Kafka-related resources (e.g., scripts, configuration, Docker Compose)

## Configuration

Application properties are managed in `src/main/resources/application.yml` or `application.properties`. Kafka-specific configuration may be found in the `kafka/` folder.

## Running the Application

1. Ensure Kafka is running (see `kafka/` for setup scripts or Docker Compose).
2. Build the project:
   ```sh
   mvn clean package
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## License

This project is licensed under the MIT License. See the LICENSE file for details.