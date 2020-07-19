<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script language="JavaScript">
	function gettime() {
		var d = new Date();
		document.getElementById("t").innerHTML = d;
		window.setTimeout("gettime()", 1000);//软件1811 甘延辉 201821122020
	}
	window.onload = gettime;
</script>
<title>用户登录页面</title>
<link rel="stylesheet" type="text/css" href="css/myCss.css">
<style type="text/css">
#content1 {
	width: 600px;
	height: 300px;
	margin: 10px auto;
	font-family: "楷体";
	font-size: 20px;
}
</style>
</head>
<body class="body12">
	<div align="center">
		<div id="content1">
			现在是北京时间:
			<div id="t"></div>
			下面是登陆程序:
			<form action="${pageContext.request.contextPath }/用户LoginCheck.do"
				method="post">
				<table border="1" class="table">
					<tr>
						<th>用户登录id:</th>
						<th><input type="text" name="登录id" /></th>
					</tr>

					<tr>
						<th>密码:</th>
						<th><input type="password" name="登录密码"></th>
					</tr>

					<tr><th></th>
						<th colspan="2"><input type="submit" value="登录" />
						<input type="reset" value="重填" /></th>
					</tr> 
				</table>
			</form>
			<br/>
			<h3>若没有账户,<a href = "insert用户.jsp">可点击此处注册</a></h3>
			<br/>
			<h3><a href="loginTypeSelect.jsp">返回</a></h3>
			<%
				// 判断是否有错误信息，如果有则打印
				// 如果没有此段代码，则显示时会直接打印null
				if (request.getAttribute("err") != null) {
			%>
			<h2><%=request.getAttribute("err")%></h2>
			<%
				}
			%>
		</div>
	</div>
</body>
</html>