<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Home Page</title>
<a href="http://localhost:8080/spring_mvc_hibernate1/search">Go to Search...</a><br>
<a href="http://localhost:8080/spring_mvc_hibernate1/user">Add Another User...</a><br>
<a href="http://localhost:8080/spring_mvc_hibernate1/userslist">Go to Users List...</a><br>
</head>
<body>
<h3>Name: ${userName}</h3>
<h3>Age: ${userAge}</h3>

</body>
</html>