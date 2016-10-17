package todosproj;

import static spark.Spark.*;

import org.apache.log4j.BasicConfigurator;

import spark.Session;
import todosproj.controller.Controller;
import todosproj.util.DAO;
import todosproj.util.JdbcDAO;

public class TodosRESTFullAPI {

	private final static DAO dao = new JdbcDAO();

	private final static Controller controller = new Controller(dao);
	
	public static void main(String[] args) {
		port (80);
		BasicConfigurator.configure();
		
		before("/todos", (request, response) -> {
			
		    boolean authenticated = false;
		    Session session = request.session();
		    if(!session.equals(null)){
		    	if(session.attribute("authenticated") != null)
		    		authenticated =  (Boolean) session.attribute("authenticated");
		    }
		    // ... check if authenticated
		    if (!authenticated) {
		        halt(401, "You need to be authenticated to use the API");
		    }
		});
		
		get("/login/:user/:password", (request, response) -> {
			boolean auth = controller.authenticateUser(request.params(":user"), request.params(":password"));
			if(auth){
				request.session(true);
				request.session().attribute("authenticated", true);
				return "User " + request.params(":user") + " authenticated";
			}
			else{
				return "Authentication failed";
			}
        });
		
		get("/logout", (request, response) -> {
			request.session(false);
            return "User logged out.";
        });
		
		get("/todos", (request, response) -> {
            return controller.getAllTodos();
        });
		
		get("/hello", (request, response) -> {
            return "Hello World";
        });
		
		get("/todos/:id", (req, res) -> {
            return controller.getTodo(req.params(":id"));
        });

		post("/todos", (req, res) -> { 
			return controller.addTodo(req.body()); 
		} );

        
        put("/todos/:id", (req, res) -> {
            return controller.updateTodo(req.body(), req.params(":id"));
        });
		
        delete("/todos/:id", (req, res) -> {
            return controller.deleteTodo(req.params(":id"));
        });
		/*
        options("/todos", (request, response) -> {
            // Appease something
        });*/
		
	}

}
