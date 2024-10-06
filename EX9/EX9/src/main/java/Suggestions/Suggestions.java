package Suggestions;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Suggestions
 */
@WebServlet("/Suggestions")
public class Suggestions extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Suggestions() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String [] names={"sukesh","siva","vipin","thejoram","sibi","rokan","kishore","anand","muneesh"};
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		    String input = request.getParameter("name").toLowerCase();
		    for( String name:names){
		      if(name.startsWith(input))
		      {
		        out.println("<p>"+name+"</p>");
		      }
		    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
