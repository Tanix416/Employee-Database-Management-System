//s2.java
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class s2 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String nm=req.getParameter("nm");
HttpSession ses=req.getSession();
ses.setAttribute("name",nm);
pw.println("<form action=s3 method=get>College<input type=text name=clg><br><input type=submit value=submit></form>");
}
}