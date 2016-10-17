package todosproj.util;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import todosproj.model.Todo;
import todosproj.model.User;

public class JdbcDAO implements DAO{
	
	private static MysqlDataSource dataSource;

    static {

        try {

        	dataSource = new MysqlDataSource();
        	dataSource.setUser("dbroot");
        	dataSource.setPassword("fantastic5");
        	dataSource.setServerName("localhost");
        	dataSource.setDatabaseName("todo");
        	dataSource.setPort(3306);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }

    }
    
    @Override
	public boolean authenticate(String user, String pass) {
    	QueryRunner run = new QueryRunner( dataSource );

		try	{
			
			boolean result = false;

			ResultSetHandler<List<User>> h = new BeanListHandler<User>(User.class);

			List<User> qryuser = run.query("SELECT * FROM user where username='"+user+"' and password='"+pass+"'", h);

			if(!qryuser.isEmpty()) result = true;
			
			return result;

		} catch(SQLException sqle) {

		    throw new RuntimeException("Problem updating", sqle);

		}
    }
	
	@Override
	public boolean addTodo(Todo todo) {

    	QueryRunner run = new QueryRunner( dataSource );

		try	{

		    run.update( "INSERT INTO todos (name, status) VALUES (?,?)", todo.getName(), todo.getStatus());

		} catch(SQLException sqle) {

		    throw new RuntimeException("Problem updating", sqle);

		}

		return true;    	

    }

	@Override
	public List<Todo> getAllTodos() {
		QueryRunner run = new QueryRunner( dataSource );

		try	{

			ResultSetHandler<List<Todo>> h = new BeanListHandler<Todo>(Todo.class);

			List<Todo> todos = run.query("SELECT * FROM todos", h);

			return todos;

		} catch(SQLException sqle) {

		    throw new RuntimeException("Problem updating", sqle);

		}
	}
	
	public boolean updateTodo(Todo todo, String id) {

    	QueryRunner run = new QueryRunner( dataSource );

		try	{

		    run.update( "UPDATE todos SET name = ?, status = ? WHERE id = ? ", todo.getName(), todo.getStatus(), id);

		} catch(SQLException sqle) {

		    throw new RuntimeException("Problem updating", sqle);

		}

		return true;    	

    }
	
	public boolean deleteTodo(Todo todo, String id) {

    	QueryRunner run = new QueryRunner( dataSource );

		try	{

		    run.update( "DELETE FROM todos WHERE id = ?" , id);

		} catch(SQLException sqle) {

		    throw new RuntimeException("Problem updating", sqle);

		}

		return true;    	

    }
}