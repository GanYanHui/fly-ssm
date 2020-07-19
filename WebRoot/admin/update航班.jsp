<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改航班信息</title>
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
		<h2>修改航班信息</h2>
		<form action="${pageContext.request.contextPath }/admin/update航班.do"
			method="post">
			<table class="box8">
				<tr>
					<td>航班编号:${航班.航班编号 }<input type="hidden" name="航班编号"
						value="${航班.航班编号 }" /></td>
				</tr>
				<tr>
					<td>航线编号:<input type="text" name="航线编号" value="${航班.航线编号 }" list="航线编号"/>
						<datalist id="航线编号">
					 		<c:forEach items="${list航线 }" var="航线">
					 			<option value="${航线.航线编号 }">${航线.出发城市 }->${航线.到达城市 }</option>
							</c:forEach>
					 	</datalist>
					</td>
				</tr>
				<tr>
					<td>机型编号:<input type="text" name="机型编号" value="${航班.机型编号 }" list="机型编号"/>
						<datalist id="机型编号">
					 		<c:forEach items="${list机型 }" var="机型">
					 			<option value="${机型.机型编号 }" >${机型.机型名称 }</option>
							</c:forEach>
					 	</datalist>
					</td>
				</tr>
				<tr>
					<td>出发地候机楼编号:<input type="text" name="出发地候机楼编号" value="${航班.出发地候机楼编号 }" list="出发地候机楼编号"/>
						<datalist id="出发地候机楼编号">
					 		<c:forEach items="${list候机楼 }" var="候机楼">
					 			<option value="${候机楼.候机楼编号 }" >${候机楼.候机楼名称 }</option>
							</c:forEach>
					 	</datalist>
					</td>
				</tr>
				<tr>
					<td>目的地候机楼编号:<input type="text" name="目的地候机楼编号" value="${航班.目的地候机楼编号 }" list="目的地候机楼编号"/>
						<datalist id="目的地候机楼编号">
					 		<c:forEach items="${list候机楼 }" var="候机楼">
					 			<option value="${候机楼.候机楼编号 }" >${候机楼.候机楼名称 }</option>
							</c:forEach>
					 	</datalist>
					</td>
				</tr>
				<tr>
					<td>计划起飞时间(hh-mm-ss):<input type="text" name="计划起飞时间"
						value="${航班.计划起飞时间 }" /></td>
				</tr>
				<tr>
					<td>计划到达时间(hh-mm-ss):<input type="text" name="计划到达时间"
						value="${航班.计划到达时间 }" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="修改" /> <input
						type="reset" value="重置" /></td>
				</tr>
				
			</table>
		</form>
		<a href="${pageContext.request.contextPath }/admin/findAll航班.do">返回航班列表</a>
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