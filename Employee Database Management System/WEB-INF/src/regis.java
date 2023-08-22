import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class regis extends HttpServlet
{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
    {
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	String nm=req.getParameter("nm");
	String pwd=req.getParameter("pwd");
	String addr=req.getParameter("addr");
	String gen=req.getParameter("gen");
String fs[]=req.getParameterValues("fs");
String hd=req.getParameter("hd");
String db=req.getParameter("db");
String fn=req.getParameter("fn");
pw.print("<h3>Name "+nm);
pw.print("<br>Password:"+pwd);
pw.print("<br>Address:"+addr);
pw.print("<br>Gender:"+gen);
pw.print("<br>Favourite :");
for (int i=0;i<fs.length;i++)
   pw.print(fs[i]+" ");
pw.print("<br>Highest Degree:"+hd);
pw.print("<br>Date of Birth:"+db);
pw.print("<br>File Name:"+fn);
     }
} 