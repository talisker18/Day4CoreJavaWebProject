package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    //service method is executed when Servlet is started
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//print something on browser
		PrintWriter out = response.getWriter(); //PrintWriter interface inherited by HttpServletResponse
		//write it this way...
		out.write("hello joel print this on browser!!! test123"); //after creating the servlet, the web.xml file was updated with the servlet. so now we can start the servlet via server
		
		//..or html style
		PrintWriter out2 = response.getWriter();
		response.setContentType("text/html");
		out2.write("hello html");
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//print something on browser
		PrintWriter out = response.getWriter(); //PrintWriter interface inherited by HttpServletResponse
		response.setContentType("text/html");
		out.write("hello get method"); 

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//print something on browser
		PrintWriter out = response.getWriter(); //PrintWriter interface inherited by HttpServletResponse
		response.setContentType("text/html");
		out.write("hello post method"); 

	}

}
