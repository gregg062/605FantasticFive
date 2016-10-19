# 605FantasticFive
##Fantastic Five Team Members  
1. Gregg Weaver 
2. Timothy Winters 
3. Marceu Filho 
4. Hardeep Kumar 
5. Mary Abigail Coronado 

##Project Scope
The scope of this project is to create RESTFUL API for TODO list or task lists application using back end programming platform (Java using Sparks), database (MySQL), web server (Jetty) and host provider (Digital Ocean). The code will be compiled into a jar or war file then deploy the compiled code in Github. The endpoint would be http://localhost:4567/todos.

Fantastic Five will create the following requests 

*	GET  - the request will get  the todo items
*	CREATE – the request will create new todo items
* PUT(UPDATE) – the request will Update existing Todo by passing in the Todo ID
*	DELETE – the request will delete a todo item based on the ID.
* Post - Post new Todo by passing in Todo name and Todo status

Fantastic Five will establish authentication checks for the todo methods. 
Authentication - Authenticate user with each new session.

*	Use GET method --> http://104.131.153.97/todos --> You will be required to authenticate yourself,
*	Use GET  method to list all the Todos --> http://104.131.153.97/todos
*	User Post method to create new Todo by providing name and status in Jason format -- http://104.131.153.97/todos
*	Use Put method to update the existing Todo by passing in the ID -- http://104.131.153.97/todos/id
*	Use Delete method to delete the existing Todo by passing in the ID -- http://104.131.153.97/todos/id

##Technology stack 

*	Backend Programming language: Java Spark is a simple and lightweight Java web framework built for rapid development.  Spark focuses on being as simple and straight-forward as possible, without the need for cumbersome (XML) configuration, to enable very fast web application development in pure Java with minimal effort. (http://sparkjava.com/)

* Database: MySQL is the most popular open source database and is one of the leading database choice for web-based applications used by high profile website such as facebook and twitter. (https://www.mysql.com/)

*	Webserver: Jetty provides a Web server and javax.servlet container, plus support for HTTP/2, WebSocket, OSGi, JMX, JNDI, JAAS and many other integrations. (http://www.eclipse.org/jetty/ )

*	Hosting Provider: Digital Ocean provides cloud services that help to deploy and scale applications that run simultaneously on multiple computers. (https://www.digitalocean.com/)


Approach

*	Install and/or set up Java Spark, Database (MySQL), Cloud provider (Digital ocean) and Server (Jetty)
*	Have those three mentioned above communicate with each other.
* Create authentication checks – logins 
*	Code Restful todo states in Java (GET, CREATE,UPDATE and DELETE)
*	Compile code in a jar or war file 
* Deploy compiled code in Github.com


FINAL PRESENTATION ROLES
* Tim - Team Introduction
* Hardeep - Stack Architecture
* Gregg - Demo
* Marceu - Code review
* Mary - Issues
