//edit.java
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class edit extends HttpServlet
{
   public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
       res.setContentType("text/html");
       PrintWriter pw=res.getWriter();
       String eid=req.getParameter("eid");
       try{
       Class.forName("oracle.jdbc.OracleDriver");
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
       PreparedStatement pst=con.prepareStatement("select * from tueemp where eid=?");
        pst.setString(1,eid);
       ResultSet rs=pst.executeQuery();
        if(rs.next())
        {
         pw.println("<form action=update method=get>");
         pw.println("Eid <input type=text name=eid value="+rs.getString(1)+" readonly><br>");
         pw.println("Name <input type=text name=nm value="+rs.getString(2)+"><br>");
	 pw.println("Degn <input type=text name=degn value="+rs.getString(3)+"><br>");
         pw.println("Sal <input type=text name=sal value="+rs.getInt(4)+"><br>");
          pw.println("<input type=submit value=Update></form>");
         }
            else
	    pw.println("<h3>Eid does not exists");
          con.close();
         }
          catch(Exception e){}
       }
}
        
           






       