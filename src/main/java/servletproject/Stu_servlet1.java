package servletproject;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/StuSignup")
public class Stu_servlet1 extends GenericServlet {
	@Override
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		
		long contact = Long.parseLong(req.getParameter("con_no"));
		StudentDto dto = new StudentDto(id,name,contact);
		StudentDao dao = new StudentDao();
		int value = 0;
		try {
			value = dao.saveStudent(dto);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if( value > 0) {
			res.getWriter().print("signup success");
			
		}else {
			res.getWriter().print("Signup Fail");
		}
		
//		req.setAttribute("Stu_id", id);
//		req.setAttribute("Stu_name", name);
//		req.setAttribute("Stu_contact", contact);
//		
//		req.getRequestDispatcher("Stu_servlet2").forward(req, res);
	}

}


