package com.test.bean;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstHelloController implements org.springframework.web.servlet.mvc.Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		System.out.println("hello world"); 
		return null;
		//return new ModelAndView("start");
	}
}
