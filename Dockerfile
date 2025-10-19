# Use an official OpenJDK 17 runtime as base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the project files into the container
COPY . /app

# Expose the default port
EXPOSE 8080

# Command to run the application (assuming JAR built by Maven or Gradle)
CMD ["java", "-jar", "app.jar"]
