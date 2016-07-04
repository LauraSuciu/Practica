package com.exemple.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	throws 	ServletException, IOException{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("HELLO WORLD!!!");
		out.close();
		
	}
	

}
