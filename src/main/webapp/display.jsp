<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Class.forName("com.mysql.cj.jdbc.Driver");
   Connection con = DriverManager.getConnection("jdbc:mysql:///rupesh","root","root");
   Statement st = con.createStatement();
   ResultSet rs = st.executeQuery("select * from employee");
   
%>

<table border ="2px">
<tr>
<th>eid</th>
<th>ename</th>
<th>eemail</th>
<th>eAddress</th>
</tr>

<% while(rs.next()){%>

<tr>
<td><%= rs.getInt(1) %></td>
<td><%= rs.getString(2) %></td>
<td><%= rs.getString(3) %></td>
<td><%= rs.getLong(4) %></td>
</tr>



<%} %>


</table>



</body>
</html>