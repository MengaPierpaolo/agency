package com.project.agency.repository;

import java.util.List;

import com.project.agency.domain.City;

public interface CityRepository {
	
	public List<City> findAll();
	
	public City getCity(Long cityId);

}
