<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的订单</title>
<link rel="stylesheet" type="text/css" href="css/myCss.css">
</head>
<body class="body5">
<div align="center">
		<%
			if (session.getAttribute("用户") != null) {
		%>
		<div class="log" style="right:50px;">
			<span>${用户.用户姓名 }</span>
			<div class="dropdown-content">
				<a href="login_out.jsp" style="color:white;text-decoration:none">注销</a>
			</div>
		</div>
		<h2>我的订单</h2>
		<table border="1" class="table">
			<tr>
				<th>订单号</th>
				<th>登录id</th>
				<th>用户id</th>
				<th>订单日期</th>
				<th>机票数</th>
				<th>联系电话</th>
				<th>总额</th>
				<th>订单状态</th>
			</tr>
			<c:forEach items="${list订单 }" var="订单">
				<tr>
					<td><a href="${pageContext.request.contextPath }/find机票By订单号.do?订单号=${订单.订单号 }">${订单.订单号 }</a></td>
					<td>${订单.登录id }</td>
					<td>${订单.用户id }</td>
					<td>${订单.订单日期 }</td>
					<td>${订单.机票数 }</td>
					<td>${订单.联系电话 }</td>
					<td><font color="blue">${订单.总额 }</font></td>
					<td><font color="red">${订单.订单状态 }</font></td>
				</tr>
			</c:forEach>
		</table>
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