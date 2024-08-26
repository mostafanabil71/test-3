FROM openjdk:17-alpine AS build
WORKDIR /app

FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar .

ENTRYPOINT ["java", "-jar", "test-app.jar"]
