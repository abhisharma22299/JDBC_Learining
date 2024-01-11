import jakarta.servlet.*;
import java.io.*;

public class firstServlet extends GenericServlet{
       public void service(ServletRequest rq, ServletResponse rs) {

try{
PrintWriter pw=rs.getWriter();
pw.println("FirstServlet");
}
catch(Exception e){
System.out.println(e);
}

}
}