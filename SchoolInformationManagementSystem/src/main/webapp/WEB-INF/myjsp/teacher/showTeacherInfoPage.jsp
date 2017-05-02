<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1 th:inline="text">show Teacher Info</h1>
	<table>
		<tr>
			<td>${teacher.id}</td>
			<td><a href="#" >${teacher.teacherId}</a></td>
			<td>${teacher.teacherName}</td>
			<td>${teacher.gender}</td>
		</tr>
	</table>
</body>
</html>