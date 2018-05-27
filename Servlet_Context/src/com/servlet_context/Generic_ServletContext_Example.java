package com.servlet_context;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
public class Generic_ServletContext_Example extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		
		System.out.println("=================== request.getServletContext()");
		ServletContext servletContext = request.getServletContext();
		System.out.println(servletContext);
		
	   System.out.println("=================== servletConfig.getServletContext()");
		ServletConfig servletConfig = getServletConfig();
		ServletContext servletContext2 = servletConfig.getServletContext();
		System.out.println(servletContext2);
		
		System.out.println("==================getServletContext()");
		ServletContext servletContext3 = getServletContext();
		System.out.println(servletContext3);
		
		
		
       //To read  data from the servletcontext,
		
		System.out.println("==================getInitParameterNames()");
		Enumeration<String> initParameterNames = servletContext.getInitParameterNames();
		while(initParameterNames.hasMoreElements())
		{
			System.out.println(initParameterNames.nextElement());
		}
		
		
		System.out.println("=======================getInitParameter()");
		String eno = servletContext.getInitParameter("eno");
		System.out.println(eno);
		
		

		//To store some objects or values into servletContext.
		//we will use 1)context-param 2) setAttribute()
//after creating the servlet context,if you want to add or insert data into 
//servletContext we will use setAttribute()		
		
		String s="vijay";
		servletContext.setAttribute("name", s);
		
		Double sal=new Double(1232);
		servletContext.setAttribute("salary",sal);
		
		
//if you want to retrieve attribute which insert after the servletContext object creations
//we will use getAttribute("")	
		
		
		System.out.println("=====================getAttributeNames()");
		Enumeration<String> attributeNames = servletContext.getAttributeNames();
		while(attributeNames.hasMoreElements())
		{
			System.out.println(attributeNames.nextElement());
		}
		
		System.out.println("=====================getAttribute(String)");
		Object name = servletContext.getAttribute("name");
		System.out.println(name);
		
		Object sl = servletContext.getAttribute("salary");
		System.out.println(sl);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
