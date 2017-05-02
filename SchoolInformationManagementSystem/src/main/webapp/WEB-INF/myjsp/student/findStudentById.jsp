<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
        <h1>Hello.v.2</h1>  
        <p></p>  
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