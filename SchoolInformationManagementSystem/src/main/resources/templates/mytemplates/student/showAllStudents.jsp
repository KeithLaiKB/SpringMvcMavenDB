<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 th:inline="text">showAllStudentsList</h1>
	<table>
	<c:forEach var="student" items="${sessionScope.allStudentsList}" varStatus="status">   
		<tr>
			<td>${student.id}</td>
			<td><a href="#">${student.stuId}</a></td>
			<td>${student.stuName}</td>
			<td>${student.gender}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>