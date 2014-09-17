package com.project.agency.repository;

import java.util.List;

import com.project.agency.domain.Country;

public interface CountryRepository {
	
	public List<Country> findAll();

}
