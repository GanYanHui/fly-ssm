<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>舱位选择</title>
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
		<h2>选择舱位</h2>
		<table border="1" class="table">
			<tr>
				<th>舱位编号</th>
				<th>执飞航班编号</th>
				<th>销售价格</th>
				<th>折扣</th>
				<th>余票量</th>
				<th>行李额度</th>
				<th>行李件数</th>
				<th>餐食状态</th>
				<th>退改签规则</th>
				<th>预定</th>
			</tr>
			<c:forEach items="${list机票种类 }" var="机票种类">
				<tr>
					<td>${机票种类.舱位编号 }</td>
					<td>${机票种类.执飞航班编号 }</td>
					<td>${机票种类.销售价格 }</td>
					<td>${机票种类.折扣 }</td>
					<td>${机票种类.余票量 }</td>
					<td>${机票种类.行李额度 }</td>
					<td>${机票种类.行李件数 }</td>
					<td>${机票种类.餐食状态 }</td>
					<td>${机票种类.退改签规则 }</td>
					<td><a href="${pageContext.request.contextPath }/prepare订单.do?舱位编号=${机票种类.舱位编号 }&执飞航班编号=${机票种类.执飞航班编号}">预定</a></td>
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