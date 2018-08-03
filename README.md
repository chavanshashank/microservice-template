![Optional Text](../master/img/microservice.png)

# Micro Service Template

## Description
  This is an example of a micro-service architecture model using spring boot with Kotlin and docker with the postgresql base date.
    
## Technologies Used:

* Kotlin
* Maven
* H2
* PostgreSQL
* Spring Boot

## Dependencies

- **Docker:** https://docs.docker.com/engine/installation/
- **Docker Compose:** https://docs.docker.com/compose/install/
- **Maven. Installation Options**: 
  - Manual: https://maven.apache.org/install.html
  - http://sdkman.io: `$ sdk install maven`
  - https://brew.sh: `$ brew install maven`

## How starting service

You have two ways to run the application, with the test profile that uses the database [H2](http://www.h2database.com/html/main.html) that is a memory bank, 
or with the profile dev that would use the [postgreSQL](https://www.postgresql.org) database that runs inside a docker that is configured in the 
[docker-compose file](https://github.com/JoaoPedroCardoso/microservice-template/blob/master/docker-compose.yml)

### Starting with test profile


#### 1. Set test profile 

From the resources of micorservice-template-web directory of the application, open the application.properties:
```
$ cd microservice-template/microservice-template-web
$ cd src/main/resources
$ vim application.properties
```
Set:  ```spring.profiles.active=test```

#### 2. Build in project

```
$ mvn clean install
```
This command will compile the code and run the tests.

#### 3. Starting micorservice-template

From the root directory of the application:

```
$ cd micorservice-template
$ mvn spring-boot:run
```

or

```
$ cd microservice-template/microservice-template-web
$ cd src/main/kotlin/br/com/microservice/template/web/config
```

Start the file MicroserviceTemplateApplication.kt.
The application will be available at localhost: 8080

### Starting with dev profile using docker-compose

#### 1. Set dev profile 

From the resources of micorservice-template-web directory of the application, open the application.properties:
```
$ cd microservice-template/microservice-template-web
$ cd src/main/resources
$ vim application.properties
```
Set:  ```spring.profiles.active=dev```

#### 2. Starting docker-compose

From the root directory of the application:

```
$ cd micorservice-template
$ docker-compose up
```

#### 3. Build in project

```
$ mvn clean install
```
This command will compile the code and run the tests.

#### 4. Starting micorservice-template

From the root directory of the application:

```
$ cd micorservice-template
$ mvn spring-boot:run
```

or

```
$ cd microservice-template/microservice-template-web
$ cd src/main/kotlin/br/com/microservice/template/web/config
```

Start the file MicroserviceTemplateApplication.kt.
The application will be available at localhost: 8080

#### 5. Removing and cleaning containers if you need
```
docker-compose down
```

### Calling the hello world exposed service

Open the [Postman](https://www.getpostman.com).

Perform a GET or PUT operation on the URL: ``http://localhost:8080/hello/{name}``

Replace the variable ``{name}`` to your name and send the request.

The response should be _200_ and should return something like ```"value": "Hello yoda!"```

This project is configured with rest docs of the spring boot, when performing ``mvn clean install `` the same will be 
available in 
 
 ```
 $ cd microservice-template/microservice-template-web
 $ cd target/generated-docs
 ```
The file will be named microservice-template-manual.html
 
You can access what was generated on my machine and submit on my s3 [here](https://s3.us-east-2.amazonaws.com/microservice-templatedocumentation/doc/microservice-template-manual.html).

## Question or contact

More info about micro service architecture [here](http://microservices.io/patterns/microservices.html).

Problems or questions contact me at [github](https://github.com/JoaoPedroCardoso) or on my [linkedin](https://www.linkedin.com/in/joaopedrocar/).