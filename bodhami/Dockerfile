# Use official OpenJDK base image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy Maven dependencies (for faster caching)
COPY pom.xml ./
COPY .mvn .mvn
COPY mvnw ./
RUN ./mvnw dependency:go-offline

# Copy the source code
COPY src ./src

# Package the app
RUN ./mvnw clean package -DskipTests

# Expose the port Render uses
EXPOSE 8080

# Run the Spring Boot app
CMD ["java", "-jar", "target/bodhami-0.0.1-SNAPSHOT.jar"]
