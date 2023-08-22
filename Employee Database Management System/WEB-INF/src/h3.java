//h3.java
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class h3 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String fno=req.getParameter("fno");
String sno=req.getParameter("sno");
int sum=Integer.parseInt(fno)+Integer.parseInt(sno);
pw.println("<h3>sum is"+sum);
}
}