<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改机票种类信息</title>
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
		<h2>修改机票种类信息</h2>
		<form action="${pageContext.request.contextPath }/admin/update机票种类.do"
			method="post">
			<table class="box8">
				<tr>
					<td>舱位编号:${机票种类.舱位编号 }<input type="hidden" name="舱位编号" value="${机票种类.舱位编号 }" /></td>
				</tr>
				<tr>
					<td>执飞航班编号:${机票种类.执飞航班编号 }<input type="hidden" name="执飞航班编号" value="${机票种类.执飞航班编号 }" /></td>
				</tr>
				<tr>
					<td>销售价格:<input type="text" name="销售价格" value="${机票种类.销售价格 }" /></td>
				</tr>
				<tr>
					<td>有效起始日期(yyyy-MM-dd hh-mm-ss):<input type="text" name="有效起始日期" value="${机票种类.有效起始日期 }" /></td>
				</tr>
				<tr>
					<td>有效截至日期(yyyy-MM-dd hh-mm-ss):<input type="text" name="有效截至日期" value="${机票种类.有效截至日期 }" /></td>
				</tr>
				<tr>
					<td>折扣:<input type="text" name="折扣" value="${机票种类.折扣 }" /></td>
				</tr>
				<tr>
					<td>余票量:<input type="text" name="余票量" value="${机票种类.余票量 }" /></td>
				</tr>
				<tr>
					<td>行李额度:<input type="text" name="行李额度" value="${机票种类.行李额度 }" /></td>
				</tr>
				<tr>
					<td>行李件数:<input type="text" name="行李件数" value="${机票种类.行李件数 }" /></td>
				</tr>
				<tr>
					<td>餐食状态:<input type="text" name="餐食状态" value="${机票种类.餐食状态 }" /></td>
				</tr>
				<tr>
					<td>退改签规则:<input type="text" name="退改签规则" value="${机票种类.退改签规则 }" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="修改" /> <input
						type="reset" value="重置" /></td>
				</tr>
				
			</table>
		</form>
		<a href="${pageContext.request.contextPath }/admin/findAll机票种类.do">返回航班列表</a>
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