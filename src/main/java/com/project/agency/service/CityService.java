package com.project.agency.service;

import java.util.List;

import com.project.agency.domain.City;

public interface CityService {
	
	public List<City> findAll();
	
	public City getCity(Long cityId);

}
