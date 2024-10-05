package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter();
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		out.println(" <center>Name : "+request.getParameter("Uname")+ "<br>");
		out.println("Reg No : "+request.getParameter("Reg")+ "<br>");
		out.println("Gender : "+request.getParameter("gender")+ "<br>");
		out.println("year : "+request.getParameter("year")+ "<br>");
		out.println("Section : "+request.getParameter("section")+ "<br>");
		out.println("Phone No : "+request.getParameter("phno")+ "<br>");
		out.println("Address : "+request.getParameter("city")+ " "+request.getParameter("country")+ " "+request.getParameter("pincode")+"</center>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
