# MyRetail"

Technology stack used:

Spring Boot 2.0
NoSQL: MongoDB 3.6.3
END to End Testing: ATDD- Cucumber-java
Functional Test: Spring-boot-test, Mockito, PowerMock
Build tool : Maven
OS: Windows

#Prerequsite for this project is install the mongoDB locally from https://www.mongodb.com/download-center#enterprise 

After the mongoDB is install run the script from this https://github.com/siddharthak024/MyRetail/blob/master/src/main/resources/mongoinsertquery.sql 

1. Clone the project locally and run "mvn clean install" 
2. Run the command "java -jar target\myretail-api-0.1.0.jar" to start the API
3. For testing open new terminal and cd to MyRetail/MyRetail-ATDD/ and run "mvn clean test", it will run different scenarios against the locall running server
 
Additional Details :
Dockerfile -> Build the Docker image with the current directory.
