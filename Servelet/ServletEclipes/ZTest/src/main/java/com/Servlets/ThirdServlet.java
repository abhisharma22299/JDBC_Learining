package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest hsr, HttpServletResponse rs) throws IOException  {
		System.out.println("This is doget method in the Http servlet.................");
		rs.setContentType("text/html");
		PrintWriter pw=rs.getWriter();
		pw.println("<h1>this is doget method in http servle</h1>");
	pw.println(new Date().toLocaleString());
	}
}
