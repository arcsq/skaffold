# Run the code in a container
FROM openjdk:8-alpine
ENTRYPOINT ["java"]
EXPOSE 8080
ADD ./target/skaffold-app-0.0.1-SNAPSHOT.jar /skaffold-app.jar
ENTRYPOINT ["java","-jar","/skaffold-app.jar"]
