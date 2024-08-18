package servletproject;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieone")
public class CookieServletOne extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		Cookie c1 = new Cookie("key1","rupeshsanagala523@gmail.com");
		Cookie c2 = new Cookie("key2","Rupesh@143");
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		req.getRequestDispatcher("/cookietwo").forward(req, resp);
	}

}
