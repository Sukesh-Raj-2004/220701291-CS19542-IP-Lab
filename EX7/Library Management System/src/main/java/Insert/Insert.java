package Insert;
import java.io.*;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("Bname");
		String author = request.getParameter("author");
		String publisher = request.getParameter("publisher");
		int price = Integer.parseInt(request.getParameter("price"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/library?useSSL=false&serverTimezone=UTC";
			Connection conn = DriverManager.getConnection(url,"root","root");
			PreparedStatement ps=conn.prepareStatement("insert into books values(?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,author);
			ps.setString(3,publisher);
			ps.setInt(4,price);
			int res=ps.executeUpdate();
			if(res!=0)
			{
				out.println("Book details inserted successfully....");
			}
			else {
				out.println("Book details insertion failure....");
			}
			ps.close();
			conn.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}
}




