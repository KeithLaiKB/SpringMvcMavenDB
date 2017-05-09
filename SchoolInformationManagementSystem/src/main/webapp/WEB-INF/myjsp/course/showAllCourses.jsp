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
/* function sla()
{
	var obj = ${allCoursesList}; 
	for (var k = 0, length = obj.length; k < length; k++) {
		 alert(array[k].courseName);
		}
}
 */
</script>
	<h1>showAllStudentsList</h1>
	<table>
	<!-- use tag c -->
<%-- 	<c:forEach var="student" items="${allStudentsList}" varStatus="status">   
		<tr>
			<td>${student.id}</td>
			<td><a href="#">${student.stuId}</a></td>
			<td>${student.stuName}</td>
			<td>${student.gender}</td>
		</tr>
	</c:forEach> --%>
	</table>
</body>
</html>