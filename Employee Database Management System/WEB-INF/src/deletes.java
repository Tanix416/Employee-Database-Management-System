//deletes.java
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class deletes extends HttpServlet
{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
    {
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String eid=req.getParameter("eid");
try{
Class.forName("oracle.jdbc.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","12345");
PreparedStatement pst=con.prepareStatement("delete from tueemp where eid=(?)");
pst.setString(1,eid);
int t=pst.executeUpdate();
if(t>0)
  pw.println("<h3>Deleted Successfully");
con.close();
}
catch(Exception e)
{
pw.println(e);
}
}
}