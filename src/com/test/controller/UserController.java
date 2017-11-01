package com.test.controller;


import com.test.service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class UserController implements Controller {
	@Setter@Getter
	private UserService userService;
//最完整好用案例
	@Override
	public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
		System.out.println("ModelAndView");
		
		request.setAttribute("uname",request.getParameter("uname"));
		request.setAttribute("userName","tom");
		System.out.println("下面是从service调到的值"); 
		userService.save(request.getParameter("uname"));
		
		return new ModelAndView("/index2");
	}
}
