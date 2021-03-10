package com.motivity;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public class HibernateConfig {

	@Autowired
	private EntityManager entityManager;
	
	@Bean
	@Primary
	public Session getSession()
	{
		Session se=entityManager.unwrap(Session.class);
		
		return se;		
	}
}
