package servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HttpServlet1")
public class HttpServlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = (String)req.getAttribute("name"); 
		PrintWriter pw = res.getWriter();
		if(name!=null) {
			pw.print("Hello " + name);
			
		}else {
			pw.print("No input given");
		}
		
	}

}
