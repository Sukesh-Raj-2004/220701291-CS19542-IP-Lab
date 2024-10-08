package StudentServlet;
import java.sql.*;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StudentServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/students?useSSL=false&serverTimezone=UTC";
			Connection conn = DriverManager.getConnection(url,"root","root");
			PreparedStatement ps=conn.prepareStatement("select * from students where regno=?"); 
			int regno = Integer.parseInt(request.getParameter("regno"));
			ps.setInt(1, regno);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				out.println("<center><h1>Student Details</h1></center>");
				out.println("<hr>");
				out.println("Student Reg No :"+regno);
				out.println("<br>");
				out.println("Student Name :"+rs.getString(2));
				out.println("<br>");
				out.println("Department :"+rs.getString(3));
				out.println("<br>");
				out.println("Year :"+rs.getInt(4));
				out.println("<br>");
				conn.close();
			}
		}
		catch(Exception e)
		{
			out.println("Error"+e);
		}


	}

	
}
