FROM openjdk:17
LABEL maintainer="basil"
ADD target/JenkinsDemo-1.jar docker-demo.jar
ENTRYPOINT [ "java","-jar","docker-demo.jar" ]
EXPOSE 8089
