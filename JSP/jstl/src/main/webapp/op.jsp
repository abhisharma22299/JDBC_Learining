<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String n1 = request.getParameter("n1");
	String n2 = request.getParameter("n2");
	int num1 = Integer.parseInt(n1);
	int num2 = Integer.parseInt(n2);
	int sum = num1 / num2;
	%>
	<h1>
		Result :
		<%=sum%></h1>
</body>
</html>