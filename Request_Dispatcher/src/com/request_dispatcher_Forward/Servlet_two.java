package com.request_dispatcher_Forward;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_two")
public class Servlet_two extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Enumeration<String> attributeNames = request.getAttributeNames();
		while(attributeNames.hasMoreElements())
		{
			System.out.println(attributeNames.nextElement());
		}
		Object gst = request.getAttribute("gst");
		PrintWriter out = response.getWriter();
		out.println(gst);
		
		
		
		
	}

}
