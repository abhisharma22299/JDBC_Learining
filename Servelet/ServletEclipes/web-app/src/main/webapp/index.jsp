<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet</title>
</head>
<body>
<h1>welcome to home page </h1>


<h1></h1>
<%= new Date().toLocaleString()  %>
<br>
<a href="login">	LoginServlet
</a>
</body>
</html>