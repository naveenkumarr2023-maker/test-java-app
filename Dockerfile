FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY target/simple-java-app-1.0.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
