<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员界面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/myCss.css">
</head>
<body class="body12">
<div align="center">
		<%
			if (request.getAttribute("管理员") != null || session.getAttribute("管理员") != null) {
				if(request.getAttribute("管理员") != null){
					session.setAttribute("管理员", request.getAttribute("管理员"));
				}
		%>
		<div class="log" style="right:50px;">
			<span>${管理员.登录id }</span>
			<div class="dropdown-content">
				<a href="${pageContext.request.contextPath }/login_out.jsp" style="color:white;text-decoration:none">注销</a>
			</div>
		</div>
		<h2>
			欢迎id为<font color="red">${管理员.管理员id }</font>的管理员光临
		</h2>
		<h2><a href="${pageContext.request.contextPath }/admin/findAll航班.do">查询所有航班</a></h2>
		<h2><a href="${pageContext.request.contextPath }/admin/findAll执飞航班.do">查询所有执飞航班</a></h2>
		<h2><a href="${pageContext.request.contextPath }/admin/findAll机票种类.do">退改签规则修改、舱位产品执行价格调整</a></h2>
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