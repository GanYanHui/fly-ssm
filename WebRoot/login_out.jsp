<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注销登录,退出</title>
<link rel="stylesheet" type="text/css" href="css/myCss.css">
</head>
<body class="body5">
	<div align="center">
		<%
			session.invalidate();
		%>
		<h2>
			已退出登录,若要重新登录,请点击<a href="loginTypeSelect.jsp">登录</a>
		</h2>
	</div>
</body>
</html>