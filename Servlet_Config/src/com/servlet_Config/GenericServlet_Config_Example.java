package com.servlet_Config;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class GenericServlet_Config_Example extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		
		
	
		//we can create ServletConfig object only one way
	System.out.println("=====================getServletConfig()");
		ServletConfig servletConfig = getServletConfig();
		
		
		
		
	System.out.println("=====================getServletName()");
		String servletName = servletConfig.getServletName();
		System.out.println(servletName);
		
		
		
		
		
	System.out.println("=========================getInitParameter()");
		String eno = servletConfig.getInitParameter("eno");
		System.out.println(eno);
		String name = servletConfig.getInitParameter("name");
		System.out.println(name);
		String salary = servletConfig.getInitParameter("salary");
		System.out.println(salary);
	
		
		
		
	System.out.println("==========================getInitParameterNames()");
		Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
		while(initParameterNames.hasMoreElements())
		{
			System.out.println(initParameterNames.nextElement());
		}
		
	
		
		
	System.out.println("=========================getServletContext()");
		ServletContext servletContext = servletConfig.getServletContext();
		System.out.println(servletContext);
		
		
		
		
		
		
		
		
		PrintWriter out = response.getWriter();
	    out.println(eno);
	    out.print(name);
	    out.println(salary);
		
		
	}

}
