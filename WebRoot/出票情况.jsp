<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>出票情况</title>
<link rel="stylesheet" type="text/css" href="css/myCss.css">
</head>
<body class="body3">
<div align="center">
		<h2>出票情况</h2>
		<%
			if (session.getAttribute("用户") != null) {
		%>
		<div class="log" style="right:50px;">
			<span>${用户.用户姓名 }</span>
			<div class="dropdown-content">
				<a href="login_out.jsp" style="color:white;text-decoration:none">注销</a>
			</div>
		</div>
		<%
			response.setHeader("refresh", "3;URL = /fly-ssm/query.jsp");
				boolean b = ((Boolean) request.getAttribute("flag")).booleanValue();
				if (b) {
		%>
		出票成功!!! <br /> 如果没有跳转，请按 <a
			href="${pageContext.request.contextPath }/fly-ssm/query.jsp">这里
		</a>！！！
		<%
			} else {
		%>
		出票失败!!!，三秒后跳转到查询页面 <br /> 如果没有跳转，请按 <a
			href="${pageContext.request.contextPath }/fly-ssm/query.jsp">这里
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