package com.test.controller;

import com.test.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/Anno")
@SessionAttributes({"session1","sessionValue"})//放入session里的值要写在类的上面
public class CustomerController {

	@Resource
	private CustomerService customerService;

	@RequestMapping(value = "/method")
	public String method(String uname) {
		System.out.println("method()");
		System.out.println(uname);
		
		System.out.println("下面是service的方法"); 
		customerService.save(uname);

		return "/index2";
	}

	@RequestMapping("/method2")
	public String method2(@RequestParam("uname")String name, HttpServletRequest request) {
		System.out.println(name); 
		request.setAttribute("a","1234");
		return "/index3";
	}

	//ModelMap  ModelMap的值默认都放在request里
	@RequestMapping("/method3")
	public String method3(ModelMap map,HttpServletRequest request) {
		map.addAttribute("dog", "rose");
		map.put("cat", "jack");
		request.getSession().setAttribute("mouse","tom");
		return "/index4";
	}
//用注解方式把数据放在session中 这样request和session里都有了 request是为了页面传值方便
	@RequestMapping("/method4")
	public String method4(HttpServletRequest request,ModelMap map) {
		request.setAttribute("session1","sessionValue1");
		request.getSession().setAttribute("session2","sessionValue2");
		map.put("session2", "sessionValue2");
		return "/index4";
	}


	//用注解方式放入session中值
	//@RequestMapping("/method5")
	//@SessionAttributes("session1")
	//public String method5(ModelMap map,HttpServletRequest request) {
	//	request.setAttribute("session1","sessionValue");
	//	map.put("session1", "a");
	//	return "/index5";
	//}

	//@ModelAttribute  将上面放入session的值再放在下一个方法中 直接获取
	@RequestMapping("/method6")
	public String method6(@ModelAttribute("session2")String session2) {
		System.out.println(session2);
		return "/index6";
	}
	//重定向
	@RequestMapping("/method7")
	public String method7(ModelMap map) {
		return "redirect:http://www.baidu.com";
	}
}

