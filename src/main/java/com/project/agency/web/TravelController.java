package com.project.agency.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.agency.domain.Travel;
import com.project.agency.service.CityService;
import com.project.agency.service.TravelService;

@Controller
public class TravelController {
	
	@Autowired
	private TravelService travelService;
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping("/")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("travels", travelService.findAll());
		return modelAndView;
	}
	
	@RequestMapping(value = "/travel/new", method = RequestMethod.GET)
	public ModelAndView addTravel() {
		ModelAndView modelAndView = new ModelAndView("travel/new");
		modelAndView.addObject("newTravel", new Travel());
		modelAndView.addObject("destinyList", cityService.findAll());		
		return modelAndView;		
	}
	
	@RequestMapping(value = "/travel/new", method = RequestMethod.POST)
	public ModelAndView addTravelProcess(
			@ModelAttribute("newTravel") @Valid Travel travel, BindingResult result) {
		System.out.println(travel.toString());
		System.out.println(travel.getCity().getCountryName());
		return null;
	}
}
