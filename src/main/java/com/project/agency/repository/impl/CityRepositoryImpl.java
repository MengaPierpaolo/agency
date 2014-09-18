package com.project.agency.repository.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.agency.domain.City;
import com.project.agency.repository.CityRepository;

@Repository
public class CityRepositoryImpl implements CityRepository {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<City> findAll() {
		@SuppressWarnings("unchecked")
		List<City> cities = sessionFactory.getCurrentSession().createQuery("FROM City c LEFT JOIN FETCH c.country").list();
		return cities;
	}

}
