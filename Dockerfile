FROM openjdk:8
EXPOSE 9809
ADD target/docker-automation-0.0.1-SNAPSHOT.jar docker-automation-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker-automation-0.0.1-SNAPSHOT.jar"]
