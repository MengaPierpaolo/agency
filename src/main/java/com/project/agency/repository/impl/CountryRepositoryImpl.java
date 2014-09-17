package com.project.agency.repository.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.agency.domain.Country;
import com.project.agency.repository.CountryRepository;

@Repository
public class CountryRepositoryImpl implements CountryRepository {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Country> findAll() {
		@SuppressWarnings("unchecked")
		List<Country> countries = sessionFactory.getCurrentSession().createQuery("from Country").list();
		return countries;
	}

}
