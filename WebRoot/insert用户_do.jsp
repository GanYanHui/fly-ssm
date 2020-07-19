<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册用户</title>
<link rel="stylesheet" type="text/css" href="css/myCss.css">
</head>
<body class="body4">
	<div align="center">
		<h2>注册用户</h2>
		<%
			//response.setHeader("refresh", "2;URL=用户Login.jsp");//有中文跳转失败
			boolean b = ((Boolean) request.getAttribute("flag")).booleanValue();
			if (b) {
		%>
		用户注册成功，两秒后跳转到用户登录页面！！！ <br /> 如果没有跳转，请按 <a
			href="用户Login.jsp">这里
		</a>！！！
		<%
			} else {
		%>
		用户注册失败，两秒后跳转到用户登录页面！！！ <br /> 如果没有跳转，请按 <a
			href="用户Login.jsp">这里
		</a>！！！
		<%
			}
		%>
	</div>
</body>
</html>