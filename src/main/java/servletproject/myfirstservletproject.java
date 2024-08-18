package servletproject;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/login")
public class myfirstservletproject extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		String u_name = req.getParameter("u_name");
		String password = req.getParameter("password");
		PrintWriter pw = res.getWriter();
		
		pw.print("hello "+ u_name  + " your password is correct " + password);
	}

}
