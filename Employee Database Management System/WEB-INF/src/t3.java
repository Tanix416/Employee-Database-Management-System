import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;
public class t3 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException , ServletException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String clg=req.getParameter("clg");
Cookie ob= new Cookie("college",clg);
res.addCookie(ob);
pw.println("<form action=t4 method=get>Stream<input type=text name=stm><br><input type=submit value=submit></form>");
}
}
