package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	
		public void doPost(HttpServletRequest sq,HttpServletResponse sr) throws IOException, ServletException{
			sr.setContentType("text/html");
	        PrintWriter pw=sr.getWriter();
	        pw.println("<h1>Welcome to register page</h1>");
	        String name=sq.getParameter("user_name");
	        String password=sq.getParameter("password");
	        String email=sq.getParameter("email");
	        String gender=sq.getParameter("user_gender");
	        String course=sq.getParameter("course");
	      System.out.println(name+password+email+gender+course);
	      pw.println("<h1>name      :"+  name+ " </h1>");
	   //   pw.println("<h1>password  :"+password +"</h1>");
	      pw.println("<h1>gender    : "+gender +" </h1>");
	      pw.println("<h1>course    : "+course +"</h1>");
	      
	      // Request dispatcher
	      RequestDispatcher rd=sq.getRequestDispatcher("index.jsp");
	      rd.include(sq, sr);
		 
		}
	
}
