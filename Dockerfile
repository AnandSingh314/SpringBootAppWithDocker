FROM java:8

MAINTAINER Anand Singh "avsmips@gmail.com"

EXPOSE 8080
ADD /target/SpringBootApp-0.0.1-SNAPSHOT.jar SpringBootApp.jar
ENTRYPOINT ["java","-jar","SpringBootApp.jar"]

