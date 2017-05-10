<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">

</script>  
	<h1>showAllMajorList</h1>
	<table>
	
	<!-- use tag c -->
 	<c:forEach var="major" items="${allMajorList}" varStatus="status">   
		<tr>
			<td>${major.majorId}</td>
			<td><a href="#">${major.majorName}</a></td>
		</tr>
	</c:forEach> 
	</table>
</body>
</html>