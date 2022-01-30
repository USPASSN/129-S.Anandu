<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<title>Spring MVC Hello World</title>
</head>

<body>
	<h2>All Company in System--created by ${name} ${title}</h2>
	<table border="1">
		<tr>
			<th>Company Name</th>
		</tr>
		<c:forEach items="${companies}" var="company">
			<tr>
				<td>${company.companyName}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>