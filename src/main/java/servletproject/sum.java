package servletproject;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/sum")
public class sum extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws IOException , ServletException {
		String a = req.getParameter("a");
		int a1 = Integer.parseInt(a);
		
		String b = req.getParameter("b");
		int b1 = Integer.parseInt(b);

		int result = a1+b1;
		PrintWriter pw = res.getWriter();
		
		pw.print("sum of " +  a + " and " +  b + " is:  " + result);
	}

}
