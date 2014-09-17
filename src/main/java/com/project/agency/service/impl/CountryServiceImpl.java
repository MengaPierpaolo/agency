package com.project.agency.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.agency.domain.Country;
import com.project.agency.repository.CountryRepository;
import com.project.agency.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	private CountryRepository countryRepository;

	@Transactional
	public List<Country> findAll() {
		return countryRepository.findAll();
	}

}
