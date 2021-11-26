package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.write("<h1>Your registration was successfull. See bellow for your registration information</h1><br><br>");
		
		String gender = request.getParameter("gender");
		out.write("<span>Your gender: </span>");
		out.write("<span style=\"color:green;\">"+gender+"</span><br><br>");
		
		String fname = request.getParameter("firstname");
		out.write("<span>Your firstname: </span>");
		out.write("<span style=\"color:green;\">"+fname+"</span><br><br>");
		
		String lname = request.getParameter("lastname");
		out.write("<span>Your lastname: </span>");
		out.write("<span style=\"color:green;\">"+lname+"</span><br><br>");
		
		String email = request.getParameter("email");
		out.write("<span>Your email: </span>");
		out.write("<span style=\"color:green;\">"+email+"</span><br><br>");
		
		String[] names = request.getParameterValues("programming_language");
		List<String> list = Arrays.asList(names);
		out.write("<span>Your programming languages: </span>");
		out.write("<span style=\"color:green;\">"+list+"</span><br><br>");
		
		String username = request.getParameter("username");
		out.write("<span>Your Username: </span>");
		out.write("<span style=\"color:green;\">"+username+"</span><br><br>");
		
		String password = request.getParameter("password");
		out.write("<span>Your Password: </span>");
		out.write("<span style=\"color:green;\">"+password+"</span><br><br>");
		
		String dob = request.getParameter("date-of-birth");
		out.write("<span>Your Date of Birth: </span>");
		out.write("<span style=\"color:green;\">"+dob+"</span><br><br>");
		
	}

}
