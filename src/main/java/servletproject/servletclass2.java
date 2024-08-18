package servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/s2")
public class servletclass2 extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		PrintWriter pw = res.getWriter(); 
		pw.println("hello from s2");
		
	}

}
