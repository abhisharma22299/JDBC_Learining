<%-- 
    Document   : first
    Created on : 02-Feb-2024, 10:56:29 pm
    Author     : Abhishek Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.util.Random,java.util.ArrayList" %>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%! 
        int a =50;
        int b=50;
            public  int doSum(){
return a+b;
}
        %>
        <% 
        out.println(a);
        out.println("<br>");
        out.println(b);
        out.println("<br>");
        out.println(doSum());
        %>
        <h1>Sum is <%= doSum() %></h1>
        
        
        <br><!-- comment -->
    
        <h1> Random number :
        
        <% 
        
        Random r=new Random();
        int n=  r.nextInt(6);
        out.println(n);
        %>
        </h1>
        

    </body>
</html>
