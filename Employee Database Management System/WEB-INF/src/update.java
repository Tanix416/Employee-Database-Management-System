import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;
public class update extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException , ServletException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String eid=req.getParameter("eid");
String nm=req.getParameter("nm");
String degn=req.getParameter("degn"); 
int sal=Integer.parseInt(req.getParameter("sal"));
try{
Class.forName("oracle.jdbc.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","12345");
PreparedStatement pst=con.prepareStatement("update tueemp set name=?,degn=?,sal=? where eid=?");
pst.setString(1,nm);
pst.setString(2,degn);
pst.setInt(3,sal);
pst.setString(4,eid);
int t=pst.executeUpdate();
if(t<0)
  pw.println("<h3>Updated successfully");
con.close();
}
catch(Exception e){}
}
}
