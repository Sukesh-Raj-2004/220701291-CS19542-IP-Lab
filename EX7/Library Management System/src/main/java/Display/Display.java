package Display;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Display
 */
@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Display() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/library?useSSL=false&serverTimezone=UTC";
			Connection conn = DriverManager.getConnection(url,"root","root");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * from books");
			out.println("<center><table border ='2'> <tr> <td>Name</td> <td>Author</td> <td>Publisher</td> <td>Price</td>");
			while (rs.next()) {
                out.println("<tr><td>" + rs.getString("name") + "</td><td>" + rs.getString("author")+ "</td><td>" + rs.getString("publisher") +  "</td><td>" + rs.getInt("price") + "</td></tr>");
            }
			out.println("</table></center>");
			rs.close();
			st.close();
			conn.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}


}
