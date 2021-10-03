FROM openjdk:11
ADD target/security.jar security.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","security.jar"]