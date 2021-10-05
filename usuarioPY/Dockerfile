FROM container-registry.oracle.com/java/serverjre:8u261
LABEL maintainer="proyectoand@hotmail.com"
LABEL version=1.0.0
ADD micro-service-spring-boot-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]