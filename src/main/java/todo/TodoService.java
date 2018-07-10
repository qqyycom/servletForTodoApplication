package todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
  private static List<Todo> todoList = new ArrayList<>();
  
  static{
    Todo todo1 = new Todo("To learn servlet","study");
    Todo todo2 = new Todo("To learn mybatis","study");
    todoList.add(todo1);
    todoList.add(todo2);
  }
  
  public List<Todo> getTodoList(){
    return todoList;
  }
  
  public void addTodo(Todo todo){
    
    todoList.add(todo);
  }
  
  public void deleteTodo(String todoName, String category){
    todoList.remove(new Todo(todoName, category));
  }
}
