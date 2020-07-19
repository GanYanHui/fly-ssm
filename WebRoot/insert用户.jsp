<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<link rel="stylesheet" type="text/css" href="css/myCss.css">
</head>
<body class="body4">
	<div align="center">
		<h2>用户注册</h2>
		<form action="${pageContext.request.contextPath }/insert用户.do"
			method="post" >
			<table class="box8" >
				<tr>
					<td>登录id:</td>
					<td><input type="text" name="登录id" /></td>
				</tr>
				<tr>
					<td>登录密码:</td>
					<td><input type="text" name="登录密码" /></td>
				</tr>
				<tr>
					<td>联系电话:</td>
					<td><input type="text" name="联系电话" /></td>
				</tr>
				<tr>
					<td>邮箱:</td>
					<td><input type="text" name="邮箱" /></td>
				</tr>
				<tr>
					<td>用户姓名:</td>
					<td><input type="text" name="用户姓名" /></td>
				</tr>
				<tr>
					<td>身份证号:</td>
					<td><input type="text" name="用户身份证号" /></td>
				</tr>
				<tr>
					<td>用户性别:</td>
					<td><input type="radio" name="用户性别" value="男" checked="checked" />男
						<input type="radio" name="用户性别" value="女" />女
					</td>
				</tr>
				<tr>
					<td>用户年龄:</td>
					<td><input type="text" name="用户年龄" /></td>
				</tr>
				<tr><td></td>
					<td colspan="2"><input type="submit" value="提交" /> <input
						type="reset" value="重置" /></td>
				</tr>

			</table>
		</form>
		<a href="用户Login.jsp">返回用户登录界面</a>
	</div>
</body>
</html>