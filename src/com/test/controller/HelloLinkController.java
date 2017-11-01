package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloLinkController {
	@RequestMapping("/hellolink")
	public String hello() {
		System.out.println("hello link");
		return "success";
	}
}
