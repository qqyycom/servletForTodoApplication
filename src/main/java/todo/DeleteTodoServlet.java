package todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteTodoServlet
 */
@WebServlet("/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  private TodoService todoService = new TodoService();
  /**
   * @see HttpServlet#HttpServlet()
   */
  public DeleteTodoServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String todoName = request.getParameter("todo");
    String category = request.getParameter("category");
    todoService.deleteTodo(todoName, category);
    response.sendRedirect("/list-todo.do");
  }

}
