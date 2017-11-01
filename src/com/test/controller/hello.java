package com.test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class hello{
	@RequestMapping(value = "method1",method = RequestMethod.GET)
	public void method1() {
		System.out.println("hello1"); 
	}

	@RequestMapping(value = "method2",method = RequestMethod.GET)
	public void method2() {
		System.out.println("hello2");
	}
}

