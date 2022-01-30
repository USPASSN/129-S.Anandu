<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users List</title>
<a href="/spring_mvc_hibernate_new/search"> Searh...</a><br>
<a href="/spring_mvc_hibernate_new/user"> Add User...</a>
</head>
<body>

	<table border="1">
		<tr>
			<th>UserId </th>
			<th>UserName </th>
			<th>UserAge </th>
			<th>Update</th>
			<th>Delete</th>
			
		</tr>
		
		<c:forEach items="${uList}" var="users">
			<tr>
				<td>${users.id}</td>
				<td>${users.userName}</td>
				<td>${users.userAge}</td>
				<td><a href="/spring_mvc_hibernate_new/update/${users.id}">Update</a></td>
				<td><a href="/spring_mvc_hibernate_new/delete/${users.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>