package todo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodeServlet
 */
@WebServlet("/list-todo.do")
public class ListTodoServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  private TodoService todoService = new TodoService();
  /**
   * @see HttpServlet#HttpServlet()
   */
  public ListTodoServlet() {
    super();
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    List<Todo> todoList = todoService.getTodoList(); 
    request.setAttribute("todoList", todoList);
    request.getRequestDispatcher("views/todo.jsp").forward(request,response);
  }

}
