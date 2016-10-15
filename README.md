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
* UPDATE – the request will update a todo item based on the ID.
*	DELETE – the request will delete a todo item based on the ID.

Fantastic Five will establish authentication checks for the todo methods. 

*	http://localhost:4567/todos (get and post - show all and create)
* http://localhost:4567/login/admin/fantastic  (this url authenticates the user and release the todos methods above)
*	http://localhost:4567/logout (log the user out and kills the session - todos methods will be halted)

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
