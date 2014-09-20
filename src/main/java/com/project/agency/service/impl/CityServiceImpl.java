package com.project.agency.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.agency.domain.City;
import com.project.agency.repository.CityRepository;
import com.project.agency.service.CityService;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityRepository cityRepository;

	@Transactional
	public List<City> findAll() {
		return cityRepository.findAll();
	}

	@Transactional
	public City getCity(Long cityId) {
		return cityRepository.getCity(cityId);
	}

}
