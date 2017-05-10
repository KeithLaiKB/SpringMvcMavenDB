<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>insert teacher</h1>
	<form action="/controller/major/insertMajor" method="post">
		<table>
			<caption>insert major</caption>
			<tr>
				<td>majorName:</td>
				<td><input type="text" name="majorName"
					placeholder="input the majorName here" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit " /></td>
			</tr>

		</table>
	</form>
</body>
</html>
