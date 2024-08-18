package com.session;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionlogin")
public class HttpSessionLogoutServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		if(email.equals("abc") && password.equals("123")) {
			HttpSession session =req.getSession();
			session.setAttribute("key1", email);
			session.setAttribute("key2", password);
			resp.getWriter().print("Login Success");
			
			
		}else {
			resp.getWriter().print("login Failure");
		}
	}

}
