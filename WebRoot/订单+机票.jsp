<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单+机票</title>
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
		<h2>订单信息</h2>
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

			<tr>
				<td>${订单.订单号  }</td>
				<td>${订单.登录id }</td>
				<td>${订单.用户id }</td>
				<td>${订单.订单日期 }</td>
				<td>${订单.机票数 }</td>
				<td>${订单.联系电话 }</td>
				<td><font color="blue">${订单.总额 }</font></td>
				<td><font color="red">${订单.订单状态 }</font></td>
			</tr>

		</table>
		
		<h2>机票信息</h2>
		<table border="1" class="table">
			<tr>
				<th>机票编号</th>
				<th>乘机人身份证号</th>
				<th>订单号</th>
				<th>舱位编号</th>
				<th>执飞航班编号</th>
				<th>座位编号</th>
				<th>机场建设费</th>
				<th>保险费</th>
				<th>机票价格</th>
				<th>备注</th>
				<th>值机状态</th>
				<th>登机号</th>
			</tr>
			<c:forEach items="${list机票 }" var="机票">
				<tr>
					<td>${机票.机票编号 }</td>
					<td>${机票.乘机人身份证号 }</td>
					<td>${机票.订单号 }</td>
					<td>${机票.舱位编号 }</td>
					<td>${机票.执飞航班编号 }</td>
					<td>${机票.座位编号 }</td>
					<td>${机票.机场建设费 }</td>
					<td>${机票.保险费 }</td>
					<td>${机票.机票价格 }</td>
					<td>${机票.备注 }</td>
					<td>${机票.值机状态 }</td>
					<td>${机票.登机号 }</td>
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