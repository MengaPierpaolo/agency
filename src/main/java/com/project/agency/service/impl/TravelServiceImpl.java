package com.project.agency.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.agency.domain.Travel;
import com.project.agency.repository.TravelRepository;
import com.project.agency.service.TravelService;

@Service
public class TravelServiceImpl implements TravelService {
	
	@Autowired
	private TravelRepository travelRepository;

	@Transactional
	public List<Travel> findAll() {
		return travelRepository.findAll();
	}

}
