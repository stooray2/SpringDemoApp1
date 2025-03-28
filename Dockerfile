# Use Ubuntu as the base image for the build stage
FROM ubuntu:latest AS build

# Install JDK and Maven
RUN apt-get update && \
    apt-get install openjdk-17-jdk maven -y

# Set the working directory
WORKDIR /app

# Copy the entire project into the container
COPY . .

# Use Maven to build the project and create the jar file
RUN mvn clean package -DskipTests

# Use a slim JDK image for the runtime stage
FROM openjdk:17-jdk-slim

# Expose the application's port
EXPOSE 8081

# Copy the jar file from the build stage to the runtime stage
COPY --from=build /app/target/SpringApp1-1.jar api1.jar

# Set the entrypoint to run the jar file
ENTRYPOINT ["java", "-jar", "api1.jar"]
