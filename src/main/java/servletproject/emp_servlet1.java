package servletproject;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/employee")
public class emp_servlet1 extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		long contact = Long.parseLong(req.getParameter("con_no"));
		
		req.setAttribute("e_id", id);
		req.setAttribute("e_name", name);
		req.setAttribute("e_email", email);
		req.setAttribute("e_contact", contact);
		
		req.getRequestDispatcher("emp_servlet2").forward(req, res);
	}

}
