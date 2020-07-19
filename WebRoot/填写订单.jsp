<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="jmu.fly.po.用户"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>填写订单</title>
<link rel="stylesheet" type="text/css" href="css/myCss.css">
</head>
<body class="body2">
	<div align="center">
		<%
			if (session.getAttribute("用户") != null) {
				用户 用户 = (用户)session.getAttribute("用户");
		%>
		<div class="log" style="right:50px;">
			<span>${用户.用户姓名 }</span>
			<div class="dropdown-content">
				<a href="login_out.jsp" style="color:white;text-decoration:none">注销</a>
			</div>
		</div>
		<!-- 执飞航班信息写一下 -->
		
		<h2>机票种类</h2>
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
			</tr>
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
			</tr>
		</table>
		<br/>
		<form action="${pageContext.request.contextPath }/create订单.do"
			method="post">
			<h3>乘机人信息</h3>
			<table class="box8" >
				<tr>
					<th>乘机人姓名:</th>
					<td><input type="text" name="乘机人姓名"></td>
				</tr>

				<tr>
					<th>乘机人身份证号:</th>
					<td><input type="text" name="乘机人身份证号"></td>
				</tr>

				<tr>
					<th>乘机人联系电话:</th>
					<td><input type="text" name="乘机人联系电话"></td>
				</tr>

				<tr>
					<th>乘机人性别:</th>
					<td><input type="radio" name="乘机人性别" value="男"
						checked="checked">男 <input type="radio" name="乘机人性别"
						value="女"> 女</td>
				</tr>
			</table>

			<h3>联系人信息</h3>
			<table class="box8" >
				<tr>
					<th>联系电话:</th>
					<td><input type="text" name="联系电话"></td>
				</tr>
			</table>
			<table>
				<tr><th><input type="hidden" name="用户_登录id" value = "<%=用户.get登录id() %>"/></th>
					<th><input type="hidden" name="用户_用户id" value = "<%=用户.get用户id() %>"/></th>
					<th><input type="hidden" name="执飞航班编号" value="${机票种类.执飞航班编号 }"/></th>
					<th><input type="hidden" name="舱位编号" value="${机票种类.舱位编号 }"/></th>
					<th><input type="submit" value="提交" /></th>
					<th><input type="reset" value="重填" /></th>
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