<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">

			<tr>
			<th>User ID</th>
			<th>Name</th>
			<th>Age</th>
			</tr>

	<c:forEach items="${users}" var="user">

			<tr>
			<td>${id}</td>
			<td>${userName}</td>
			<td>${userAge}</td>
	</c:forEach>

</table>
</body>
</html>