import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;
public class t4 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException , ServletException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String stm=req.getParameter("stm");
Cookie a[]=req.getCookies();
if(a!=null)
{
for(int i=0;i<a.length;i++)
{
if(a[i].getName().equals("name"))
pw.println("<h3>name"+a[i].getValue());
else if(a[i].getName().equals("college"))
pw.println("<h3>College"+a[i].getValue());
}
}
pw.println("<h3>Stream"+stm);
}
}
