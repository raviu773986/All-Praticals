<%@ page import="java.sql.*" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%!
	Connection con;
	PreparedStatement ps;

	public void jspInit() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Pass@1234");
			ps = con.prepareStatement("insert into account values(?,?,?,?)");

		} catch (Exception e ) {
			e.printStackTrace();
		}
	

	}

	public void jspDestroy() {
		try {
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}%>

<%
int accountno = Integer.parseInt(request.getParameter("accno"));
String lastname = request.getParameter("lastname");
String firstname = request.getParameter("firstname");
int bal = Integer.parseInt(request.getParameter("bal"));

ps.setInt(1, accountno);
ps.setString(2, lastname);
ps.setString(3, lastname);
ps.setInt(4, bal);

ps.executeUpdate();
%>


<%@include file="openaccount.html" %>




