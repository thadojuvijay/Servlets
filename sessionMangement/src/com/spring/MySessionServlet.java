package com.spring;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MySessionServlet")
public class MySessionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession();
		//session.setMaxInactiveInterval(5);
		session.setAttribute("name", "xyz");
		//request.getRequestDispatcher("/MySession_Second").forward(request, response);
		response.getWriter().println("<a href='http://localhost:2015/sessionMangement/MySession_Second'>Next page</a>");
	}

}
