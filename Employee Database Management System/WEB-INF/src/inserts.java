//inserts.java
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class inserts extends HttpServlet
{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
    {
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	String eid=req.getParameter("eid");
	String nm =req.getParameter("nm");
	String degn=req.getParameter("degn");
	int sal=Integer.parseInt(req.getParameter("sal"));
	try{
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","12345");
	PreparedStatement pst=con.prepareStatement("insert into tueemp values(?,?,?,?)");
	pst.setString(1,eid);
	pst.setString(2,nm);
	pst.setString(3,degn);
	pst.setInt(4,sal);
	int t=pst.executeUpdate();
	if(t>0)
	 pw.println("<h3>Inserted Successfully");
	con.close();
	}
	catch(Exception e)
	{
	  pw.print(e);
	}
	
     }
} 