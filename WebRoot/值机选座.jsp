<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="jmu.fly.po.乘机人"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>值机选座</title>
<link rel="stylesheet" type="text/css" href="css/myCss.css">
</head>
<body class="body3">
	<div align="center">
		<%
			if (session.getAttribute("用户") != null) {
				乘机人 乘机人 = (乘机人) request.getAttribute("乘机人");
				System.out.println(乘机人);
		%>
		<form action="${pageContext.request.contextPath }/create机票.do"
			method="post">
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
			<h2>值机选座</h2>
			<table border="1" class="table">
				<tr>
					<th>座位编号</th>
					<th>机型编号</th>
					<th>舱位编号</th>
					<th>位置</th>
					<th>是否安全座位</th>
				</tr>
				<c:forEach items="${list座位表 }" var="座位表">
					<tr>
						<td>${座位表.座位编号 }</td>
						<td>${座位表.机型编号 }</td>
						<td>${座位表.舱位编号 }</td>
						<td>${座位表.位置 }</td>
						<td>${座位表.安全座位 }</td>
					</tr>
				</c:forEach>
			</table>

			<h2>确认信息,并选择座位</h2>
			<table class="box8" >
				<tr>
					<th>乘机人身份证号:</th>
					<td>${乘机人.乘机人身份证号 }<input type="hidden" name="乘机人身份证号" value=${乘机人.乘机人身份证号 }></td>
				</tr>
				<tr>
					<th>订单号:</th>
					<td>${订单.订单号 }<input type="hidden" name="订单号" value=${订单.订单号 }></td>
				</tr>

				<tr>
					<th>执飞航班编号:</th>
					<td>${机票种类.执飞航班编号 }<input type="hidden" name="执飞航班编号" value=${机票种类.执飞航班编号 }></td>
				</tr>
				<tr>
					<th>舱位编号:</th>
					<td>${机票种类.舱位编号 }<input type="hidden" name="舱位编号" value=${机票种类.舱位编号 }></td>
				</tr>
				<tr>
					<th>座位编号:</th>
					<td><input type="text" name="座位编号" list="座位编号">
						<datalist id="座位编号">
					 		<c:forEach items="${list座位表 }" var="座位表">
					 			<option value="${座位表.座位编号 }" >${座位表.位置 }</option>
							</c:forEach>
					 	</datalist>
					</td>
				</tr>
				<tr>
					<th>选择:</th>
					<td>
						<input type="submit" value="确认">
					</td>
				</tr>
			</table>
				
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