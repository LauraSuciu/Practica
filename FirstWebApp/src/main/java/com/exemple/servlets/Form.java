package com.exemple.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Form extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	throws 	ServletException, IOException{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<p>Nu e cu Nasoleala!!! ;)</p>");
		out.println("<p>"+request.getParameter("username")+" "+request.getParameter("password")+"</p>");
		out.close();
		
	}
	

}