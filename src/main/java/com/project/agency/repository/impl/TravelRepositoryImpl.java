package com.project.agency.repository.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.agency.domain.Travel;
import com.project.agency.repository.TravelRepository;

@Repository
public class TravelRepositoryImpl implements TravelRepository {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Travel> findAll() {
		@SuppressWarnings("unchecked")
		List<Travel> travels = sessionFactory
				.getCurrentSession()
				.createQuery(
						"FROM Travel t LEFT JOIN FETCH t.city as c LEFT JOIN FETCH c.country ORDER BY t.startDate DESC")
				.list();
		return travels;
	}

	@Override
	public void save(Travel travel) {
		sessionFactory.getCurrentSession().saveOrUpdate(travel);
	}

}
