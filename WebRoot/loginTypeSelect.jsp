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
<title>航空票务查询系统</title>
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
	<h1>航空票务查询系统</h1>
		<div id="content1">
			现在是北京时间:
			<div id="t"></div>
			<h3><a href = "用户Login.jsp">用户登录界面</a></h3>
			<h3><a href = "管理员Login.jsp">管理员登录界面</a></h3>
			<h3><a href = "机场管理员Login.jsp">机场管理员登录界面</a></h3>
		</div>
	</div>
</body>
</html>