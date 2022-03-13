<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My first JSP Page</title>
</head>

<body>
	<h2>My first Jsp page</h2>
	<!--  Users name is ${name} and  password is ${password}  used while entering data in url or get method when used -->
	
	<!-- <form action="/login.do" method="post">  -->
	
	<form action="/login" method="post">
	<p><font color="red">${errorMessage}</font>
	Enter your name: <input type="text" name="name"/> </br>
	Enter your password: <input type="password" name="password"/></br>	
	<input type="submit" name="submit"/></br>
	</form>
</body>
</html>