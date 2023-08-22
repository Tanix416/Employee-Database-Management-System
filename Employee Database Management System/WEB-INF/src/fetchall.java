//Fetchall.java
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class fetchall extends HttpServlet
{
   public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
     res.setContentType("text/html");
     PrintWriter pw=res.getWriter();
     try{
      Class.forName("oracle.jdbc.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
      PreparedStatement pst=con.prepareStatement("select * from tueemp");
        ResultSet rs=pst.executeQuery();
        while(rs.next())
        {
            pw.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4)+"<br>");
        }
        con.close();
      }
       catch(Exception e){}
     }
}
