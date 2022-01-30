<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<a href="http://localhost:8080/spring_mvc_hibernate1/search">Go to Search...</a><br>
<a href="http://localhost:8080/spring_mvc_hibernate1/user">Add Another User...</a><br>
<a href="http://localhost:8080/spring_mvc_hibernate1/userslist">Go to Users List...</a><br>
</head>
<body>
	<h1>Hello world!</h1>
	
	<P>The time on the server is ${serverTime}.</p>

	<form action="user" method="post">
		<p> User Name :<input type="text" name="userName"><br>
		<p> User Age : <input type="text" name="userAge"><br>
		 <input type="submit" value="add">
	</form>
</body>
</html>