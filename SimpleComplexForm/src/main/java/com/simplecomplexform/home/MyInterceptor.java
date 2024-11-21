package com.simplecomplexform.home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println("this is perihandler");
		
		String name=request.getParameter("user");
		if(name.startsWith("d")) {
			
			response.setContentType("text/html");
			response.getWriter().println("Invalid name ....should not starts with d");
			return false;
		}
		return true;
	}

}
