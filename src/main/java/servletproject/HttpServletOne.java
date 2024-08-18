package servletproject;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/httpone")
public class HttpServletOne extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int sum = a+b;
		
		req.setAttribute("sum", sum);
		
		req.getRequestDispatcher("display.jsp").forward(req,res);
		
//		res.getWriter().println("sum of 2 numbers is:" + (a+b));
		
	}

}
