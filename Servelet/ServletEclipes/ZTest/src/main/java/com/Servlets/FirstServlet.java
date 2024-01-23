package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
// Servlet is an abstract methods that we need to implements all method of the the servlet class
public class FirstServlet implements Servlet {

	ServletConfig arg0;
	// servlet life cycle method 
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Creating the objects.........");
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servicing...........");
	// set content type of the response
		arg1.setContentType("text/html");
		PrintWriter out=arg1.getWriter();
		out.println("<h1>this is my output from servlet method in services.......</h1>");
		out.println("<h1>To data and time is "+ new Date().toLocaleString()+".......</h1>");
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("going to destroy the servlet object........");
	}
	// servlet non- life cycle method
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
