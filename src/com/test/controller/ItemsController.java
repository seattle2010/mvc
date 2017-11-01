package com.test.controller;

import com.test.bean.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemsController {
@RequestMapping("/itemList")
	public ModelAndView itemsList() {

	List<Items> itemList = new ArrayList<>();
	//商品列表
	Items items_1 = new Items();
	items_1.setName("sony");
	items_1.setPrice(6000f);
	items_1.setDetail("索尼");

	Items items_2 = new Items();
	items_2.setName("dell");
	items_2.setPrice(6000f);
	items_2.setDetail("戴尔");

	itemList.add(items_1);
	itemList.add(items_2);

	ModelAndView mv = new ModelAndView();
	mv.addObject("itemList", itemList);
	//mv.setViewName("WEB-INF/jsp");
	return mv;
	}
}
