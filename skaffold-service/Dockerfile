# Run the code in a container
FROM openjdk:8-alpine
ENTRYPOINT ["java"]
EXPOSE 8090
ADD ./target/skaffold-service-0.0.1-SNAPSHOT.jar /skaffold-service.jar
ENTRYPOINT ["java","-jar","/skaffold-service.jar"]
