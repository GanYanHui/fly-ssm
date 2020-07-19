<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机场管理员界面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/myCss.css">
</head>
<body class="body12">
<div align="center">
		<%
			if (request.getAttribute("机场管理员") != null || session.getAttribute("机场管理员") != null) {
				if(request.getAttribute("机场管理员") != null){
					session.setAttribute("机场管理员", request.getAttribute("机场管理员"));
				}
		%>
		<div class="log" style="right:50px;">
			<span>${机场管理员.登录id }</span>
			<div class="dropdown-content">
				<a href="${pageContext.request.contextPath }/login_out.jsp" style="color:white;text-decoration:none">注销</a>
			</div>
		</div>
		<h2>
			欢迎id为<font color="red">${机场管理员.机场管理员id }</font>的机场管理员光临
		</h2>
		<h2><a href="${pageContext.request.contextPath }/apadmin/findAll执飞航班in_6.do">查询6小时内执飞航班动态</a></h2>
		<%
			} else {
				response.setHeader("refresh", "2;URL = /fly-ssm/loginTypeSelect.jsp");
		%>
		<h2>您还未登录，请先登录！</h2>
		<h3>2秒后将返回登陆页面</h3>
		<%
			}
		%>
	</div>
</body>
</html>