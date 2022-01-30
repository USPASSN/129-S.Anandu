<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<a href="/spring_mvc_hibernate_new/search">Search...</a><br>
<a href="/spring_mvc_hibernate_new/user">Add New User...</a><br>
<a href="/spring_mvc_hibernate_new/userslist"> Users List...</a><br>
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