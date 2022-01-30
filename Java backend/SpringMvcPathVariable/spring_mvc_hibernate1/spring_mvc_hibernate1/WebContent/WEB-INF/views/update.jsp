<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
<head>
<title>CRUD Operators with Hibernate</title>
</head>
<body>

	<h3>Update User</h3>
	${uList}
	<form method="post" action="userslist">
		<table cellpadding="2" cellspacing="2">
		
			<tr>
				<td>UserName </td>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<td>UserAge </td>
				<td><input type="text" name="userAge"></td>
			</tr>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form>

</body>
</html>