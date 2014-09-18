package com.project.agency.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.agency.service.TravelService;

@Controller
public class HomeController {
	
	@Autowired
	private TravelService travelService;
	
	@RequestMapping("/")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("travels", travelService.findAll());
		
		return modelAndView;
	}

}
