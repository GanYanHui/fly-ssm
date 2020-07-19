<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改执飞航班信息</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/myCss.css">
</head>
<body class="body9">
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
		<h2>修改执飞航班信息</h2>
		<form action="${pageContext.request.contextPath }/admin/update执飞航班.do"
			method="post">
			<table class="box8">
				<tr>
					<td>执飞航班编号:${执飞航班.执飞航班编号 }<input type="hidden" name="执飞航班编号"
						value="${执飞航班.执飞航班编号 }" /></td>
				</tr>
				<tr>
					<td>航班编号:<input type="text" name="航班编号" value="${执飞航班.航班编号 }" list="航班编号"/>
						<datalist id="航班编号">
					 		<c:forEach items="${list航班 }" var="航班">
					 			<option value="${航班.航班编号 }" />
							</c:forEach>
					 	</datalist>
					</td>
				</tr>
				<tr>
					<td>执飞日期:<input type="text" name="执飞日期" value="${执飞航班.执飞日期 }" /></td>
				</tr>
				<tr>
					<td>执行价格:<input type="text" name="执行价格" value="${执飞航班.执行价格 }" /></td>
				</tr>
				<tr>
					<td>预计起飞时间(hh-mm-ss):<input type="text" name="预计起飞时间" value="${执飞航班.预计起飞时间 }" /></td>
				</tr>
				<tr>
					<td>预计到达时间(hh-mm-ss):<input type="text" name="预计到达时间" value="${执飞航班.预计到达时间 }" /></td>
				</tr>
				<tr>
					<td>实际起飞时间(hh-mm-ss):<input type="text" name="实际起飞时间" value="${执飞航班.实际起飞时间 }" /></td>
				</tr>
				<tr>
					<td>实际到达时间(hh-mm-ss):<input type="text" name="实际到达时间" value="${执飞航班.实际到达时间 }" /></td>
				</tr>
				<tr>
					<td>状态:<input type="text" name="状态" value="${执飞航班.状态 }" /></td>
				</tr>
				<tr>
					<td>登机口:<input type="text" name="登机口" value="${执飞航班.登机口 }" /></td>
				</tr>
				<tr>
					<td>登机时间(hh-mm-ss):<input type="text" name="登机时间" value="${执飞航班.登机时间 }" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="修改" /> <input
						type="reset" value="重置" /></td>
				</tr>
				
			</table>
		</form>
		<a href="${pageContext.request.contextPath }/admin/findAll执飞航班.do">返回航班列表</a>
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