<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创建机票种类</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/myCss.css">
</head>
<body class="body8">
	<div align="center">
		<h2>创建机票种类</h2>
		<%
			if (session.getAttribute("管理员") != null) {
		%>
		<div class="log" style="right:50px;">
			<span>${管理员.登录id }</span>
			<div class="dropdown-content">
				<a href="${pageContext.request.contextPath }/login_out.jsp" style="color:white;text-decoration:none">注销</a>
			</div>
		</div>
		<%
			//response.setHeader("refresh", "2;URL=findAll机票种类.do");
				boolean b = ((Boolean) request.getAttribute("flag")).booleanValue();
				if (b) {
		%>
		创建机票种类成功，两秒后跳转到所有机票种类列表页！！！ <br /> 如果没有跳转，请按 <a
			href="${pageContext.request.contextPath }/admin/findAll机票种类.do">这里
		</a>！！！
		<%
			} else {
		%>
		创建机票种类失败，两秒后跳转到所有机票种类列表页！！！ <br /> 如果没有跳转，请按 <a
			href="${pageContext.request.contextPath }/admin/findAll机票种类.do">这里
		</a>！！！
		<%
			}
		%>
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