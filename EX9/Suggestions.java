import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Suggestions extends HttpServlet
{
  String [] names={"sukesh","siva","vipin","thejoram","sibi","rokan","kishore","anand","muneesh"};
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String input = request.getParameter("name").toLowerCase();
    for( String name:names){
      if(name.startsWith(input))
      {
        out.println("<p>"+name+"</p>");
      }
    }
    out.close();
  }
}