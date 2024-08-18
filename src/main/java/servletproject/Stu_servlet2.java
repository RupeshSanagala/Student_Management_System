package servletproject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Stu_servlet1")
public class Stu_servlet2 extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) {
		int id = (int) req.getAttribute("Stu_id");
		String name = (String) req.getAttribute("Stu_name");
		long contact = (long) req.getAttribute("Stu_contact");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rupesh?user=root&password=root");
			PreparedStatement pst = con.prepareStatement("insert into Student values(?,?,?)");
			pst.setInt(1, id);
			pst.setString(2,name);
		    pst.setLong(3, contact);
			int value = pst.executeUpdate();
			if(value != 0) {
				res.getWriter().println("data saved successfully");
			}else {
				res.getWriter().println("data insertion failure");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
