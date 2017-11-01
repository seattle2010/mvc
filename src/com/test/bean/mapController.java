package com.test.bean;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

public class mapController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		System.out.println("map"); 
		HashMap<String, Object> map = new HashMap<>();
		map.put("map1", "tom");
		map.put("map2", "jack");
		map.put("map3", "rose");
		return new ModelAndView("mapWelcome","mapCollection",map);
	}
}
