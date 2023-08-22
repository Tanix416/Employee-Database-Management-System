//searchr.java
import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class searchr extends HttpServlet
{
   public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
      res.setContentType("text/html");
      PrintWriter pw=res.getWriter();
       String nm=req.getParameter("nm");
      try{
       Class.forName("oracle.jdbc.OracleDriver");
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
       PreparedStatement pst=con.prepareStatement("select * from tueemp where name like '"+nm+"%'");
        ResultSet rs=pst.executeQuery();
	while(rs.next())
        {
         String eid=rs.getString(1);
         pw.println("<br><a href=fetch?eid="+eid+">"+rs.getString(2)+"</a>");
       }
      con.close();
      }
       catch(Exception e){}
    }
}

