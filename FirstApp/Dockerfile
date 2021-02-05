FROM openjdk:8
VOLUME /tmp
EXPOSE 8080
ADD target/FirstApp.jar FirstApp.jar
ENTRYPOINT ["java","-jar","/FirstApp.jar"]