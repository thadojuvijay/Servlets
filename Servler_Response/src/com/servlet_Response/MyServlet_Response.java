package com.servlet_Response;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class MyServlet_Response extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		response.flushBuffer();
		
		int bufferSize = response.getBufferSize();
		System.out.println(bufferSize);
		
		String characterEncoding = response.getCharacterEncoding();
		System.out.println(characterEncoding);
		
		String contentType = response.getContentType();
		System.out.println(contentType);
		
		
		
		Locale locale = response.getLocale();
		System.out.println(locale);
		
		ServletOutputStream servletOutputStream = response.getOutputStream();
		System.out.println(servletOutputStream);
		
		PrintWriter out = response.getWriter();
		out.print("printwriter");
		
		
		boolean committed = response.isCommitted();
		System.out.println(committed);
		
		
		
		response.reset();
		
		
		response.resetBuffer();
		
		
		response.setBufferSize(29);
		
		
		response.setCharacterEncoding("");
		
		
		
		response.setContentLength(28);
		
		
		response.setContentLengthLong(28);
		
		
		
		response.setContentType("text/html");
		
		
		response.setLocale(locale);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
