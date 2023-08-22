//s3.java
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class s3 extends HttpServlet
{
public void doGet(HttpServletRequest req ,HttpServletResponse res)throws IOException,ServletException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String clg=req.getParameter("clg");
HttpSession ses=req.getSession();
ses.setAttribute("clg",clg);
pw.println("<form action=s4 method=get>Stream<input type=text name=stm><br><input type=submit value=submit></form>");
}
}