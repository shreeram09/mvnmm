<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<h2>welcome to maven deployed ear</h2>
<input type='text' name='user' id='user' onchange='setName();'/>
<a id='l' href="${pageContext}/MyServlet">click me</a>


<script>
	function setName(){
		var u = document.getElementById('user');
		document.getElementById('l').href+='?user='+u;
	}
</script>
</body>
</html>