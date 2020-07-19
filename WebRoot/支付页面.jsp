<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>支付页面</title>
<link rel="stylesheet" type="text/css" href="css/myCss.css">
</head>
<body class="body3">
	<div align="center">
		<%
			if (session.getAttribute("用户") != null) {
		%>
		<h2>订单信息</h2>
		<table border="1" class="table">
			<tr>
				<th>订单状态:</th>
				<td><font color="red">${订单.订单状态 }</font></td>
			</tr>
			<tr>
				<th>订单总额</th>
				<td>${订单.总额 }</td>
			</tr>
			<tr>
				<th>订单号:</th>
				<td>${订单.订单号 }</td>
			</tr>
			<tr>
				<th>订单日期:</th>
				<td>${订单.订单日期 }</td>
			</tr>
			<tr>
				<th>订单日期:</th>
				<td>${订单.订单日期 }</td>
			</tr>
			<tr>
				<th>机票数:</th>
				<td>${订单.机票数}</td>
			</tr>
			<tr>
				<th>联系电话:</th>
				<td>${订单.联系电话}</td>
			</tr>
		</table>
		<br/>
		<h2>机票种类</h2>
		<table border="1" class="table">
			<tr>
				<th>航班编号</th>
				<th>销售价格</th>
				<th>折扣</th>
				<th>余票量</th>
				<th>行李额度</th>
				<th>行李件数</th>
				<th>餐食状态</th>
				<th>退改签规则</th>
			</tr>
			<tr>
				<td>${机票种类.舱位编号 }</td>
				<td>${机票种类.销售价格 }</td>
				<td>${机票种类.折扣 }</td>
				<td>${机票种类.余票量 }</td>
				<td>${机票种类.行李额度 }</td>
				<td>${机票种类.行李件数 }</td>
				<td>${机票种类.餐食状态 }</td>
				<td>${机票种类.退改签规则 }</td>
			</tr>
		</table>
		<br/>
		<h2>乘机人信息</h2>
		<table border="1" class="table">
			<tr>
				<th>乘机人姓名:</th>
				<td>${乘机人.乘机人姓名 }</td>
			</tr>
			<tr>
				<th>乘机人身份证号:</th>
				<td>${乘机人.乘机人身份证号 }</td>
			</tr>
			<tr>
				<th>乘机人性别:</th>
				<td>${乘机人.乘机人性别 }</td>
			</tr>
			<tr>
				<th>乘机人联系电话:</th>
				<td>${乘机人.乘机人联系电话 }</td>
			</tr>
		</table>

		<h2>
			<a
				href="${pageContext.request.contextPath }/findAll座位表.do?乘机人身份证号=${乘机人.乘机人身份证号}&订单号=${订单.订单号}&执飞航班编号=${机票种类.执飞航班编号}&舱位编号=${机票种类.舱位编号}">点击支付</a>
		</h2>
		<h2>
			<a href="query.jsp">取消</a>
		</h2>
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