package com.session;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionhome")
public class HttpSessionHomeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		HttpSession session = req.getSession();
		String email = (String) session.getAttribute("key1");
		String password = (String) session.getAttribute("key2");
		if(email!=null && password!=null) {
			resp.getWriter().print("Welcome Home");
			
		}else {
			resp.sendRedirect("loginSession.html");
		}
		
	}

}
