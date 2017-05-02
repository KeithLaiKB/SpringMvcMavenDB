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
	<h1>insert teacher</h1>
	<form action="/controller/teacher/updateTeacher" method="post">
		<table>
			<caption>update teacher</caption>
			<tr>
				<td>id:</td>
				<td><input type="text" name="id"  value="${teacher.id}" readonly="readonly"  /></td>
			</tr>
			<tr>
				<td>teacher id:</td>
				<td><input type="text" name="teacherId" value="${teacher.teacherId}" readonly="readonly" /></td>
			</tr>
			<tr>
				<td>teacherName:</td>
				<td><input type="text" name="teacherName" value="${teacher.teacherName}" /></td>
			</tr>
			<tr>
				<td>gender:</td>
				<td><input type="text" name="gender" value="${teacher.gender}"  /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit "/></td>
			</tr>

		</table>
	</form>
</body>
</html>