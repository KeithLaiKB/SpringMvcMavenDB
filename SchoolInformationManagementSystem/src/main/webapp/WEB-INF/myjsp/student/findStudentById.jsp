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
        <h1 th:inline="text">Hello.v.2</h1>  
        <p th:text="${hello}"></p>  
        <form action="/controller/student/findStudentById" method="post">
        	<table>
        	<caption>find signle student by id</caption>
        		<tr>
        			<td>id:</td>
        			<td><input type="text" name="id" placeholder="input the id here"/></td>
        		</tr>
        	</table>
        </form>
    </body>  
</html>  