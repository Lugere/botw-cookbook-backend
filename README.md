# botw-cookbook-backend

Backend API for [botw-cookbook-frontend](https://github.com/Lugere/botw-cookbook-frontend)

## Requirements

For building and running the application you need:

- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

First you need to install all dependencies:

```shell
mvn install
```

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.KokosKitchen.API.ApiApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
