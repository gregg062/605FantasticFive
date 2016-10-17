package todosproj.util;

import java.util.List;

import todosproj.model.Todo;

public interface DAO {
	public boolean authenticate(String user, String pass);
	
	public boolean addTodo(Todo todo);

	public List<Todo> getAllTodos();
	
	public Todo getTodo(String id);
	
	public boolean updateTodo(Todo todo, String id);
	
	public boolean deleteTodo(String id);
}
