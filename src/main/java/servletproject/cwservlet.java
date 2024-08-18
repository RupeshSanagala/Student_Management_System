package servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cwservlet")
public class cwservlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws IOException {
		String fname = req.getParameter("name");
		String lname = req.getParameter("surname");
		String pwd = req.getParameter("pwd");
		
		PrintWriter pw = resp.getWriter();
		if(fname!= null) {
			pw.print("your acc is succesfully created" + "Mr." + fname);
		}else {
			pw.print("sorry acc creation filure");
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter pw  = res.getWriter();
		pw.print("dopost is calling");
		
	}
	

}
