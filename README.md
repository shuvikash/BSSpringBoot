# Spring Boot Api
This is an example application, where we can perform CRUD operation on Users.

### Requirements
JDK version 1.8 or later, You can install it from following link:<br />
http://www.oracle.com/technetwork/java/javase/downloads/index.html <br />
set JDK path to your system through system properties.

#### Database: PostgreSQL
Schema: postgres <br />
Table: users <br />
field: id(int), firstName(char), lastName (char), email(char), mobile(char), age(char), dob(char), location(char) <br />
Set the database username, password and your configured database port to the application.properties file.

### How to Start the Project?
Clone the source repository through Git: <br />
git clone https://github.com/shuvikash/BSSpringBoot.git <br />


### How to run the project?
You can run through terminal: <br />
command: gradlew build bootRun <br />
or, you can run through IntelliJ IDEA IDE by Application.java class because there is main method.<br />
It will start the tomcat server on configured port(in my case:8086).<br />

Api is called by react applicaton which is running on port 8080.<br />
You can find react application in my repository.
