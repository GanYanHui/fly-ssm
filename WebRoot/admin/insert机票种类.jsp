<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创建机票种类</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/myCss.css">
</head>
<body class="body8">
	<div align="center">
		<%
			if (session.getAttribute("管理员") != null) {
		%>
		<div class="log" style="right: 50px;">
			<span>${管理员.登录id }</span>
			<div class="dropdown-content">
				<a href=${pageContext.request.contextPath } /login_out.jsp
					style="color: white; text-decoration: none">注销</a>
			</div>
		</div>
		<h2>创建机票种类</h2>
		<form action="${pageContext.request.contextPath }/admin/insert机票种类.do"
			method="post">
			<table class="box8">
				<tr>
					<th>舱位编号:</th>
					<td><input type="text" name="舱位编号" list="舱位编号" /> <datalist
							id="舱位编号"> <c:forEach items="${list舱位 }" var="舱位">
							<option value="${舱位.舱位编号 }">${舱位.舱位名称 }</option>
						</c:forEach> </datalist></td>
				</tr>
				<tr>
					<th>执飞航班编号:</th>
					<td><input type="text" name="执飞航班编号" list="执飞航班编号" /> <datalist
							id="执飞航班编号"> <c:forEach items="${list执飞航班 }"
							var="执飞航班">
							<option value="${执飞航班.执飞航班编号 }" />
						</c:forEach> </datalist>
					</td>
				</tr>
				<tr>
					<th>销售价格:</th>
					<td><input type="text" name="销售价格" /></td>
				</tr>
				<tr>
					<th>有效起始日期(yyyy-MM-dd hh-mm-ss):</th>
					<td><input type="text" name="有效起始日期" /></td>
				</tr>
				<tr>
					<th>有效截至日期(yyyy-MM-dd hh-mm-ss):</th>
					<td><input type="text" name="有效截至日期" /></td>
				</tr>
				<tr>
					<th>折扣:</th>
					<td><input type="text" name="折扣" /></td>
				</tr>
				<tr>
					<th>余票量:</th>
					<td><input type="text" name="余票量" /></td>
				</tr>
				<tr>
					<th>行李额度:</th>
					<td><input type="text" name="行李额度" /></td>
				</tr>
				<tr>
					<th>行李件数:</th>
					<td><input type="text" name="行李件数" /></td>
				</tr>
				<tr>
					<th>餐食状态:</th>
					<td><input type="text" name="餐食状态" /></td>
				</tr>
				<tr>
					<th>退改签规则:</th>
					<td><input type="text" name="退改签规则" /></td>
				</tr>
				<tr>
					<th></th>
					<td colspan="2"><input type="submit" value="提交" /> <input
						type="reset" value="重置" /></td>
				</tr>

			</table>
		</form>
		<a href="${pageContext.request.contextPath }/admin/findAll机票种类.do">返回机票种类列表</a>
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