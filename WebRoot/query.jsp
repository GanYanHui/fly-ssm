<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询页面</title>
<link rel="stylesheet" type="text/css" href="css/myCss.css">
</head>
<body class="body1">
<div align="center">
		<%
			if (request.getAttribute("用户") != null || session.getAttribute("用户") != null) {
				if(request.getAttribute("用户") != null){
					session.setAttribute("用户", request.getAttribute("用户"));
				}
		%>
		<div class="log" style="right:50px;">
			<span>${用户.用户姓名 }</span>
			<div class="dropdown-content">
				<a href="login_out.jsp" style="color:white;text-decoration:none">注销</a>
			</div>
		</div>
		<h2>
			欢迎用户:<font color="red">${用户.用户姓名 }</font>光临
		</h2>
		<h2>按航班编号查询航班</h2>
		<form
			action="${pageContext.request.contextPath }/find执飞航班By航班编号.do"
			method="post">
			航班编号:<input type="text" name="航班编号" /> <input type="submit"
				value="查询" />
		</form>
		<h2>按日期查询航班</h2>
		<form
			action="${pageContext.request.contextPath }/find执飞航班By执飞日期.do"
			method="post">
			日期(yyyy-mm-dd):<input type="text" name="日期" /> <input type="submit"
				value="查询" />
		</form>
		<h2>按机场名称查询航班</h2>
		<form
			action="${pageContext.request.contextPath }/find执飞航班By机场名称.do"
			method="post">
			机场:<input type="text" name="机场名称" /> <input type="submit"
				value="查询" />
		</form>
		<h2>查询机票</h2>
		<form action = "${pageContext.request.contextPath }/find执飞航班By城市And日期.do" method = "post">
			<table>
				<tr><th>出发城市:</th><td><input type = "text" name = "出发城市" /></td></tr>
				<tr><th>到达城市:</th><td><input type = "text" name = "到达城市" /></td></tr>
				<tr><th>日期(yyyy-mm-dd):</th><td><input type="text" name="执飞日期" /></td></tr>
				<tr><th></th><td><input type = "submit" value = "查询"></td></tr>
			</table>
		</form>
		<form action="${pageContext.request.contextPath }/find订单By用户id.do" method = "post" >
			<input type = "hidden" name = "用户id" value = ${用户.用户id }>
			<h2>点击查看<input type = "submit" value = "我的订单"></h2>
		</form>
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