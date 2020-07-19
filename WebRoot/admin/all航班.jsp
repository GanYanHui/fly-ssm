<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有航班信息</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/myCss.css">
</head>
<body class="body5">
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
		<h2>所有航班信息</h2>
		<form action="${pageContext.request.contextPath }/admin/find航班ByLike.do">
			请输入查询内容:<input type="text" name="string">
			<input type="submit" value="查询">
			<input type="button" onclick="location.href='${pageContext.request.contextPath }/admin/findAll航班.do'" value="显示所有航班">
		</form>
		
		<table border="1" class="table">
			<tr>
				<th>航班编号</th>
				<th>航线编号</th>
				<th>机型编号</th>
				<th>出发地候机楼编号</th>
				<th>目的地候机楼编号</th>
				<th>计划起飞时间</th>
				<th>计划到达时间</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
			<c:forEach items="${list航班 }" var="航班">
				<tr>
					<td>${航班.航班编号 }</td>
					<td>${航班.航线编号 }</td>
					<td>${航班.机型编号 }</td>
					<td>${航班.出发地候机楼编号 }</td>
					<td>${航班.目的地候机楼编号 }</td>
					<td>${航班.计划起飞时间 }</td>
					<td>${航班.计划到达时间 }</td>
					<td><a href="${pageContext.request.contextPath }/admin/find航班By航班编号.do?航班编号=${航班.航班编号}">修改</a></td>
					<td><a href="${pageContext.request.contextPath }/admin/delete航班By航班编号.do?航班编号=${航班.航班编号}">删除</a></td>
				</tr>
			</c:forEach>
		</table>
		<br/>
		<h3><a href="${pageContext.request.contextPath }/admin/beforeInsert航班.do">新增航班</a></h3>
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