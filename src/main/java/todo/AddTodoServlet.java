package todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodeServlet
 */
@WebServlet("/add-todo.do")
public class AddTodoServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  private TodoService todoService = new TodoService();
  /**
   * @see HttpServlet#HttpServlet()
   */
  public AddTodoServlet() {
    super();
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.getRequestDispatcher("/views/add-todo.jsp").forward(request,
        response);
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    Todo todo = new Todo(request.getParameter("todo"),
        request.getParameter("category"));
    todoService.addTodo(todo);
    // request.getRequestDispatcher("views/todo.jsp").forward(request,response);
    response.sendRedirect("/list-todo.do");
  }

}
