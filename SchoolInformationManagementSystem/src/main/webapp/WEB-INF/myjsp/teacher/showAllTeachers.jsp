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
	<h1>showAllStudentsList</h1>
	<table>
	<!-- use tag c -->
	<c:forEach var="teacher" items="${allTeachersList}" varStatus="status">   
		<tr>
			<td>${teacher.id}</td>
			<td><a href="#">${teacher.teacherId}</a></td>
			<td>${teacher.teacherName}</td>
			<td>${teacher.gender}</td>
			<td ><a href="/controller/teacher/toUpdateTeacher?id=${teacher.id}" >update</a> </td> 
			<td ><a href="/controller/teacher/deleteTeacherById?id=${teacher.id}">delete</a> </td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>