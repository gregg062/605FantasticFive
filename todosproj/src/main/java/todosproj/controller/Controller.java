package todosproj.controller;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

import todosproj.model.Todo;
import todosproj.util.DAO;

public class Controller {
	private DAO dao;
	
	ObjectMapper mapper =  JsonFactory.create();

	public Controller(DAO dao) {
		super();
		this.dao = dao;
	}
	
	public boolean authenticateUser(String user, String pass){
		return dao.authenticate(user, pass);
	}

	public String addTodo(String json){
		Todo todo = mapper.fromJson(json, Todo.class);		

		if (dao.addTodo(todo)){
			return "{\"message\":\"Added a person!\"}"; 
		} else {
			return "{\"message\":\"Failed to add a person\"}";
		}
	}
	
	public String getAllTodos(){
		return mapper.toJson(dao.getAllTodos());
	}
	
	public String updateTodo(String json, String id){
		Todo todo = mapper.fromJson(json, Todo.class);
		
		if(dao.updateTodo(todo, id)) {
			return "{\"message\":\"Updated todo!\"}";
		} else {
			return "{\"message\":\"Failed to Update todo\"}";
		}
	}
	
	public String deleteTodo(String json, String id) {
		Todo todo = mapper.fromJson(json, Todo.class);
		
		if (dao.deleteTodo(todo, id)) {
			return "{\"message\":\"Deleted todo!\"}"; 
		}else {
			return "{\"message\":\"Failed to delete todo\"}";
		}		
		
	}
}
