package com.ru.servlets.sessionm;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class TargetServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		Cookie[] cookies =request.getCookies();
		for(int i = 0; i < cookies.length; i++)
		{
			System.out.println(cookies[i].getName());
			System.out.println(cookies[i].getValue());
		}
		
		
		HttpSession session = request.getSession();
		String userName = (String)session.getAttribute("user");
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>User name stroed on session is: " +userName + "</h1>");
		
		
	}

	
}
