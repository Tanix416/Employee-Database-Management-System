
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class t2 extends HttpServlet
{
   public void doGet(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException
    {
       res.setContentType("text/html");
       PrintWriter pw=res.getWriter();
       String nm=req.getParameter("nm");
       Cookie ob= new Cookie("name",nm);
        res.addCookie(ob);
        pw.println("<form action=t3 method=get>College<input type=text name=clg><br><input type=submit value=submit></form>");
      
       }
}
        
           






       