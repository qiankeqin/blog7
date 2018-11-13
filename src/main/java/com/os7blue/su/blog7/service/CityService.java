package com.os7blue.su.blog7.service;

import com.os7blue.su.blog7.pojo.City;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/*
 * 服务层
 * */
@Service
public class CityService {

	
	public List<City> list(){
		List list = new ArrayList();
		City city = new City();
		city.setId("demo");
		city.setName("test");
		list.add(city);
		return list;
	}
	
	
}
