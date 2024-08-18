package servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/s1")
public class servletclass1 extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		PrintWriter pw  = res.getWriter();
		pw.println("hello from s1");
		//To connect two servlet use getRequestDispatcher(Interface)
		//.include
		//.forward
		req.getRequestDispatcher("s2").forward(req, res);
	}
	

}
