# syntax=docker/dockerfile:1

FROM eclipse-temurin:17-jdk-jammy
ENV HOME=/opt/app
WORKDIR $HOME 
ADD jenkins_demo-0.0.1-SNAPSHOT.jar $HOME 
ENTRYPOINT ["java", "-jar", "/opt/app/jenkins_demo-0.0.1-SNAPSHOT.jar" ]
