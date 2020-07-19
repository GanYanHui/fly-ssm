<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询航班结果</title>
<link rel="stylesheet" type="text/css" href="css/myCss.css">
</head>
<body class="body2">
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
		<h2>查询航班结果</h2>
		<table border="1" class="table">
			<tr>
				<th>执飞航班编号</th>
				<th>航班编号</th>
				<th>执飞日期</th>
				<th>执行价格</th>
				<th>预计起飞时间</th>
				<th>预计到达时间</th>
				<th>实际起飞时间</th>
				<th>实际到达时间</th>
				<th>状态</th>
				<th>登机口</th>
				<th>登机时间</th>
				<th>订票</th>
			</tr>
			<c:forEach items="${list执飞航班 }" var="执飞航班">
				<tr>
					<td>${执飞航班.执飞航班编号 }</td>
					<td>${执飞航班.航班编号 }</td>
					<td>${执飞航班.执飞日期 }</td>
					<td>${执飞航班.执行价格 }</td>
					<td>${执飞航班.预计起飞时间 }</td>
					<td>${执飞航班.预计到达时间 }</td>
					<td>${执飞航班.实际起飞时间 }</td>
					<td>${执飞航班.实际到达时间 }</td>
					<td>${执飞航班.状态 }</td>
					<td>${执飞航班.登机口 }</td>
					<td>${执飞航班.登机时间 }</td>
					<td><a href="${pageContext.request.contextPath }/find机票种类By执飞航班编号.do?执飞航班编号=${执飞航班.执飞航班编号 }">订票</a></td>
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