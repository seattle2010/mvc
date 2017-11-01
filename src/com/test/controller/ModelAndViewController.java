package com.test.controller;

import com.test.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
@Controller
@RequestMapping("/mav")
public class ModelAndViewController extends MultiActionController{
	@RequestMapping("/mothod1")
	public ModelAndView reg(String name) {
		//ModelAndView mv = new ModelAndView("/index6");
		ModelAndView mv = new ModelAndView();
		mv.addObject("dog", "dog1");
		mv.setViewName("index6");

		User user = new User();
		user.setUserName("jack");
		mv.addObject(user);//这是一个参数的 放入对象后 因为不是map结构 但是是map储存 是用类名user当key进行访问
		mv.addObject("user", user);//也可以用两个参数的 自己写名称
		return mv;
	}
}
