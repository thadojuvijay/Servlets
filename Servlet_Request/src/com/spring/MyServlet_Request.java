package com.spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet_Request implements Servlet {

	
	@Override
	public void init(ServletConfig config) throws ServletException 
	{

		
	}

	
	
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
			
		
		
		System.out.println("parameterNames()==============================");
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements())
		{
		System.out.println(names.nextElement());	
		
		}
		
		
		
	


		
 System.out.println("parameterValues()values&we should give key name===========");
		String[] values = request.getParameterValues("username");
		
		for (String e : values) {
			
			System.out.println(e);
		}
		
		
		
		
System.out.println("ParameterMap()names&parameter===============================");
		
		Map<String, String[]> parameterMap = request.getParameterMap();
		
		Set<String> set = parameterMap.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		Collection<String[]> values2 = parameterMap.values();
		Iterator<String[]> iterator2 = values2.iterator();
		String[] strings = iterator2.next();
		for(int i=0;i<strings.length;i++)
		{
			System.out.println(strings[i]);
		}
		



		
System.out.println("getParameter()================================================");
		String eno = request.getParameter("username");
		System.out.println(eno);
		
		
	
//we can store data into request object through form tag
//		        (or)
// To store data into request object,after the request object creation
//we will use setAttribute();		
		
System.out.println("=============================================setAttribute()");		
		
		String d="Banglore";
		request.setAttribute("sssssssssss",d );
		
	
		
		//after creating the request object,
		//which we insert data using setAttribute()
		//if you want to retrieve that data,we will use getAttribute(String name)
	
		
System.out.println("==================================getAttribute(string name)");			
		Object object = request.getAttribute("d");
		String a=(String)object;
		System.out.println(a);
		
		
		
System.out.println("========================================getAttributeNames()");			
		Enumeration<String> attributeNames = request.getAttributeNames();
		while(attributeNames.hasMoreElements())
		{
			System.out.println(attributeNames.nextElement());
		}
		
System.out.println("==========================================removeAttribute()");	
		request.removeAttribute("sssssssssss");
		
		
		
System.out.println("============================================getContentType()");
		
		String contentType = request.getContentType();
		System.out.println(contentType);
		
		
		
System.out.println("==========================================getServletContext()");	
		ServletContext servletContext = request.getServletContext();
		System.out.println(servletContext);
		
	
System.out.println("=================================================getServerPort");		
		int serverPort = request.getServerPort();
		System.out.println(serverPort);
		
		
System.out.println("===============================================getServerName()");		
		String serverName = request.getServerName();
		System.out.println(serverName);
		
		
		
System.out.println("=====================================================getScheme()");
		String scheme = request.getScheme();
		System.out.println(scheme);
		
System.out.println("==========================================getRequestDispatcher()");
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
		System.out.println(requestDispatcher);
		
System.out.println("==================================================getRemotePort");	
		int remotePort = request.getRemotePort();
		System.out.println(remotePort);
		
System.out.println("===========================getRemoteHost()");
		String remoteHost = request.getRemoteHost();
		System.out.println(remoteHost);
		
System.out.println("=========================getRemoteAddr()");
		String remoteAddr = request.getRemoteAddr();
		System.out.println(remoteAddr);
		
		
/*System.out.println("=============================getReader()");
		BufferedReader reader = request.getReader();
		String readLine = reader.readLine();
		System.out.println(readLine);*/
		
		
System.out.println("=============================getProtocol()");
		String protocol = request.getProtocol();
		System.out.println(protocol);
		
System.out.println("=============================getDispatcherType()");	
		DispatcherType dispatcherType = request.getDispatcherType();
		System.out.println(dispatcherType);
	
		
System.out.println("=================================getInputStream()");		
		ServletInputStream inputStream = request.getInputStream();
		System.out.println(inputStream);
		
		
		
System.out.println("===================================getLocalAddr()");		
		String localAddr = request.getLocalAddr();
		System.out.println(localAddr);
		
		
		
System.out.println("======================================getLocale()");		
		Locale locale = request.getLocale();
		System.out.println(locale);
	
		
		
		
System.out.println("======================================getLocales()");		
		Enumeration<Locale> locales = request.getLocales();
		while(locales.hasMoreElements())
		{
			System.out.println(locales.nextElement());
		}

		
		
System.out.println("=====================================getLocalName()");	
	String localName = request.getLocalName();
	System.out.println(localName);

	
System.out.println("======================================getLocalPort()");	
	int localPort = request.getLocalPort();
	System.out.println(localPort);
	

	
System.out.println("===================================getContentLength()");	
	int contentLength = request.getContentLength();
	System.out.println(contentLength);
	

System.out.println("=====================================getContentLengthLong()");	
	long contentLengthLong = request.getContentLengthLong();
	System.out.println(contentLengthLong);
	
	
	
	
/*System.out.println("=======================================getAsyncContext()");	
	AsyncContext asyncContext = request.getAsyncContext();
	System.out.println(asyncContext);
	*/
	
	
System.out.println("==================================getCharacterEncoding()");
	String characterEncoding = request.getCharacterEncoding();
	System.out.println(characterEncoding);
	
	
	
System.out.println("===============================================isSecure()");		
		boolean secure = request.isSecure();
		System.out.println(secure);
		
		
	
		
		
		
		
		
		
		
		
		
	
		
		String eno1 = request.getParameter("username");
        String name = request.getParameter("password");	
		PrintWriter out = response.getWriter();
		out.println(eno1);
        out.println(name);	
        
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public ServletConfig getServletConfig() {
	
		return null;
	}
	

	
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}


	
	
}
