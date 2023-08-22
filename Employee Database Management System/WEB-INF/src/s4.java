//s4.java
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class s4 extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String stm=req.getParameter("stm");
HttpSession ses=req.getSession();
String clg=(String)ses.getAttribute("clg");
String name=(String)ses.getAttribute("name");
pw.println(name);
pw.println(clg);
pw.println(stm);
}
}