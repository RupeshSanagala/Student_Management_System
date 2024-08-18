package servletproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/rupesh?user=root&password=root");
		}
	public int saveStudent(StudentDto stu) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("insert into StudentDto values(?,?,?)");
		pst.setInt(1, stu.getId());
		pst.setString(2, stu.getName());
		pst.setLong(3, stu.getContact());
		
		return pst.executeUpdate();
	}
	
	public StudentDto findById(int id) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("select * from StudentDto wher id = ?");
		pst.setInt(1, id);
		ResultSet rs =pst.executeQuery();
		StudentDto stu = null ;
		if(rs.next()) {
			stu = new StudentDto(rs.getInt(1),
			rs.getString(2),rs.getLong(3));
		}
     	return stu;
		
		
	}

}
