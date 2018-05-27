package com.spring;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MySession_Second")
public class MySession_Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		/*HttpSession session = request.getSession();
		session.setMaxInactiveInterval(3);
		response.getWriter().println("session value------"+session.getAttribute("name"));
		System.out.println("session--getId-----"+session.getId());
		System.out.println("session object----"+session.isNew());
		System.out.println("session creation time----"+session.getCreationTime());
		System.out.println("session last accessed time----"+session.getLastAccessedTime());
		System.out.println("session getId----"+session.getId());*/
		
		Cookie[] cookies = request.getCookies();
		
	}

}
