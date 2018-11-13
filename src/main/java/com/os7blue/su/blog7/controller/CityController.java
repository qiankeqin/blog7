package com.os7blue.su.blog7.controller;


import com.os7blue.su.blog7.pojo.City;
import com.os7blue.su.blog7.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;


/*
 * SpringMVC控制器
 * */
@Controller
public class CityController {

	@Autowired
	private CityService cityService;

	@RequestMapping("/lists")
	public String list(Map<String, Object> model) {
		List<City> cities = cityService.list();
		model.put("city", cities);
		return "lists.html";
	}
}
