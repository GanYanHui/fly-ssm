<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有机票种类信息</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/myCss.css">
</head>
<body class="body8">
<div align="center">
		<%
			if (session.getAttribute("管理员") != null) {
		%>
		<div class="log" style="right:50px;">
			<span>${管理员.登录id }</span>
			<div class="dropdown-content">
				<a href="${pageContext.request.contextPath }/login_out.jsp" style="color:white;text-decoration:none">注销</a>
			</div>
		</div>
		<h2>所有机票种类信息</h2>
		<table border="1" class="table">
			<tr>
				<th>舱位编号</th>
				<th>执飞航班编号</th>
				<th>销售价格</th>
				<th>有效起始日期</th>
				<th>有效截至日期</th>
				<th>折扣</th>
				<th>余票量</th>
				<th>行李额度</th>
				<th>行李件数</th>
				<th>餐食状态</th>
				<th>退改签规则</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
			<c:forEach items="${list机票种类 }" var="机票种类">
				<tr>
					<td>${机票种类.舱位编号 }</td>
					<td>${机票种类.执飞航班编号 }</td>
					<td>${机票种类.销售价格 }</td>
					<td>${机票种类.有效起始日期 }</td>
					<td>${机票种类.有效截至日期 }</td>
					<td>${机票种类.折扣 }</td>
					<td>${机票种类.余票量 }</td>
					<td>${机票种类.行李额度 }</td>
					<td>${机票种类.行李件数 }</td>
					<td>${机票种类.餐食状态 }</td>
					<td>${机票种类.退改签规则 }</td>
					<td><a href="${pageContext.request.contextPath }/admin/find机票种类By执飞航班编号And舱位编号.do?执飞航班编号=${机票种类.执飞航班编号}&舱位编号=${机票种类.舱位编号 }">修改</a></td>
					<td><a href="${pageContext.request.contextPath }/admin/delete机票种类By执飞航班编号And舱位编号.do?执飞航班编号=${机票种类.执飞航班编号}&舱位编号=${机票种类.舱位编号}">删除</a></td>
				</tr>
			</c:forEach>
		</table>
		<br/>
		<h3><a href="${pageContext.request.contextPath }/admin/beforeInsert机票种类.do">新增机票种类</a></h3>
		<h3><a href = "managementOptions.jsp">返回功能选择页面</a></h3>
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