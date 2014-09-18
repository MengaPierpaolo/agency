package com.project.agency.repository;

import java.util.List;

import com.project.agency.domain.Travel;

public interface TravelRepository {
	
	public List<Travel> findAll();

}
