import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class first extends HttpServlet
{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
    {
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	pw.println("<h1>Welcome to Unidentified World");
     }
} 