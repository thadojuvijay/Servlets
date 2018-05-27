package com.request_dispatcher_Forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_one")
public class Servlet_one extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	String eno1 = request.getParameter("eno");
	int eno = Integer.parseInt(eno1);
	double gs=eno*38;
	request.setAttribute("gst", gs);
      ServletContext servletContext = getServletContext();
      RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/http://localhost:2015/Servlet_Config/generic");
      requestDispatcher.forward(request, response);
      System.out.println("");
      
	
	}

}
