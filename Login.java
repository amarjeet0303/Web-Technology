import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Login extends HttpServlet {
 
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        
       if(user.equals("Amarjeet")&&pass.equals("Amarjeet@0303"))
        {
            out.println("<html><body><center><h1>Welcome</h1></center></body></html>"+user);
        }
        else
        {
           RequestDispatcher rs = req.getRequestDispatcher("index.html");
           rs.include(req, res);
           out.println("<html><body><center><h1>Invalid Details...Enter Again</h1></center></body></html>");
        }
    }  
}
