package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
    /**
	 * this method is called if we press login button. the following form is attached to this method
	 * 
	 * <form action="LoginServlet" method="post">
			<input type="text" name="username" placeholder="Enter username"/>
			<input type="text" name="password" placeholder="Enter password"/>
			<button type="submit">Login</button>
			<button type="reset">Clear</button>
		</form>
	 * 
	 * ->same name as Class!!!
	 * 
	 * */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("username"); //get written text from field of form input "username" when user clicks "Login"
		String password = request.getParameter("password");
		
		if(username.equals("admin") && password.equals("123")) {
			out.write("<h1>logged in</h1>");
		}else {
			out.write("<h4>login not ok</h4>");
		}
	}

}
