<%-- 
    Document   : jstl
    Created on : 03-Feb-2024, 10:10:42 pm
    Author     : Abhishek Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
             
        <c:set var="name" value="Abhishek_Sharma" ></c:set>
        <c:out value="${name}"></c:out>
    </body>
</html>
