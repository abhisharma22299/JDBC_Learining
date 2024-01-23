package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet extends  GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse res) throws ServletException, IOException {
		// 
		System.out.println("Service mrhtod override in Generic Servlet");
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	pw.println("<h1>Working on the genric method in the genric servlet</h1>");
	}
	
	

}
