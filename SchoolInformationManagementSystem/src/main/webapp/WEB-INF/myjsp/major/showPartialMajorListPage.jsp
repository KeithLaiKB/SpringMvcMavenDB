<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery/jquery-3.2.1.js"></script>
<title>Insert title here</title>

</head>


<body>


	<%
		out.print("asdfa" + path + basePath);
	%>

	<script type="text/javascript">
	//	
	//set the intial page number and use getComposition(pageNo) to send request to server to get the first group of data
	var intialPageNo = 1;
		//
		//this method is just used for one time(init)
		$(document).ready(function() {
			//alert(model.pageNo); 
			getComposition(intialPageNo);
		});
		//
		//
		//when the botton clicked, it just use this method ,and then refresh the partial content of HTML(such as list) by js
		function getComposition(pageNo) {
			//alert(pageNo + 'abc');
			$.ajax({
				url:'/controller/major/findPartialMajorListBySpecifiedPageNo', 
				type:'post',
				data:"pageNo="+pageNo, 
				success:function(data) 
				{
					alert(data);
					//
					//parse data and obtain each element in data
					var jasonMydataContent = JSON.parse(data);
					//alert(jasonMydataContent['totalPageNum']);
					var totalPageNum=jasonMydataContent['totalPageNum'];
					var nowPageNo=jasonMydataContent['pageNo'];
					//
					//
					//
					//
					document.getElementById("partialMajorListTable").innerHTML='';  
					var tableContent="";
					$.each(jasonMydataContent['majorList'], function(i,item)  
							 {   
							 	console.log(item);  
							 	tableContent+="<tr><td style='text-align:center'>"+item.majorName+"</td></tr>";  
							
							 }); 
					tableContent+="<button onclick='getComposition"+"("+(nowPageNo-1)+")"+";'>up</button>";
					tableContent+="<button onclick='getComposition"+"("+(nowPageNo+1)+")"+";'>down</button>";
					tableContent+="<div>"+"total number of page:"+totalPageNum+"</div>";
					document.getElementById("partialMajorListTable").innerHTML=tableContent; 
				}
			});
		}

		/* 	function getComposition(pageNo){  
		 //alert(pageno);   
		 $.ajax(  
		 {  
		 url:'/controller/major/findPartialMajorListBySpecifiedPageNo',  
		 type:'post',  
		 //the pageNo is the variable to be sent to the server
		 data:"pageNo="+pageNo,  
		 success:function(data)  
		 {       
		 document.getElementById("composition").innerHTML='';  
		 var divcontent="";  
		 //加上圆括号的目的是迫使eval函数在处理JavaScript代码的时候强制将括号内的表达式（expression）转化为对象，而不是作为语句（statement）来执行。举一个例子，例如对象字面量{}，如若不加外层的括号，那么eval会将大括号识别为JavaScript代码块的开始和结束标记，那么{}将会被认为是执行了一句空语句。所以下面两个执行结果是不同的：
		 //alert(eval("{}");  // return undefined
		 //alert(eval("({})");// return object[Object]
		 var obj = eval('(' + data + ')');  
		
		 alert(obj.data.pageNo);  
		
		 console.log(obj);  
		
		 divcontent+="<table border='1' borderColor='#ccc' style='width:100%;margin:0px;padding:0px;border-collapse:collapse'>";  
		 divcontent+="<tr><th width='12%' style='text-align:center;background: #79c6fa'>图片</th><th width='12%' style='text-align:center;background: #79c6fa'>绑定</th></tr>";  
		
		 $.each(obj.data.content, function(i,item)  
		 {   
		 console.log(item);  
		 divcontent+="<tr><td style='text-align:center'><img style='width: 100px;height:50px;margin-top:8px;' src='"+item.img+"' /></td><td style='text-align:center'><input type='radio' class='button6'  id='id' name='compositionid' value="+item.id+" /></td></tr>";  
		
		 });  
		 divcontent+="</table>";  
		
		 divcontent+='<div class="pageinfo">';  
		 divcontent+='共<span>'+obj.data.totalpages+'</span>页，每页<span>'+obj.data.pagesize+'</span>条，当前是第<span>'+obj.data.nowPageNo+'</span>页';  
		 divcontent+='</div>';  
		
		 divcontent+='<div class="pagebar">';  
		
		 divcontent+='<button onclick="getComposition(1);"';  
		 if(obj.data.pageno==1){  
		 divcontent+='class="button3"  disabled';  
		 }else if(obj.data.pageno>1){  
		 divcontent+=' class="button2";'  
		 }  
		 divcontent+='>首页</button>';  
		 //
		 //点击触发调用方法，send request to server
		 divcontent+='<button onclick="getComposition('+(obj.data.pageno-1) +');"';  
		 if(obj.data.pageno==1){  
		 divcontent+='class="button3"  disabled';  
		 }else if(obj.data.pageno>1){  
		 divcontent+=' class="button2";'  
		 }  
		 divcontent+='>上页</button>';  
		 //
		 //点击触发调用方法，send request to server
		 divcontent+='<button onclick="getComposition('+(obj.data.pageno+1) +');"';  
		 if(obj.data.pageno==obj.data.totalpages){  
		 divcontent+='class="button3"  disabled';  
		 }else if(obj.data.pageno<obj.data.totalpages){  
		 divcontent+=' class="button2";'  
		 }  
		 divcontent+='>下页</button>';  
		
		 divcontent+='<button onclick="getComposition('+obj.data.totalpages +');"';  
		 if(obj.data.pageno==obj.data.totalpages){  
		 divcontent+='class="button3"  disabled';  
		 }else if(obj.data.pageno<obj.data.totalpages){  
		 divcontent+=' class="button2";'  
		 }  
		 divcontent+='>末页</button>';  
		
		 divcontent+='</div>';   
		
		 document.getElementById("composition").innerHTML=divcontent;  
		 }  
		 });  
		 } */
	</script>
	<h1>showPartialMajorList</h1>
	<div>

		<table id="partialMajorListTable">


		</table>
	</div>

	<table>





		<!-- use tag c -->
		<%-- <c:forEach var="major" items="${allMajorList}" varStatus="status">
			<tr>
				<td>${major.majorId}</td>
				<td><a href="#">${major.majorName}</a></td>
			</tr>
		</c:forEach> --%>
	</table>
</body>
</html>