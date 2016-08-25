# ApolloTest
Project to Check Jenkins,Maven, Git
Virtual Server Insatllation
1. Installed Java 7  
2. Intalled Tomcat7 
3. Installed MySql 
4. Installed Jenkins 
5. Installed Git
6.Installed Maven 

Created Repository on GitHub 
https://github.com/vikrant4k/ApolloTest/
Cloned it to on my other system 
Created a Maven Application 
Using Jersey Jax-RS 
http://localhost:8080/ApolloWeb/rest/hello with form data greeting="some data" and it will respose with sql row creation
Pushed the Code 

Virtual Server 
Cloned the Application 
Compiled it using Maven 

Jenkins Work 
set JAVA_HOME
set Maven_HOME
install maven_plugin
intall git_plugin 
installed deployment plugin
created user for deployment in tomcat-users.xml 

new job creation 
using maven 
set options
1. Gave path of Git 
2. Job Run after every few minutes or change in code. 
3. For Deployment gave the tomcat path with user authentication 

Job Runs Successfully!!




