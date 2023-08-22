//h2.java
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class h2 extends HttpServlet
{
   public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
     res.setContentType("text/html");
     PrintWriter pw=res.getWriter();
     String fno=req.getParameter("fno");
     pw.println("<form action=h3 method=get><input type=hidden name=fno value="+fno+">Second Number<input type=text name=sno><br><input type=submit value=submit></form>");
   }
}