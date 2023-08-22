//b.java


import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class b extends HttpServlet
{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
    {
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	String name=req.getParameter("nm");
	pw.println("<h3>Welcome"+name);
     }
}