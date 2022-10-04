FROM openjdk:18
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} DockerApp.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/DockerApp.jar"]
