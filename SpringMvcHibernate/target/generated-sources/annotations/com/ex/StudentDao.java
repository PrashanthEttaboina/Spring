package com.ex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class StudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public boolean saveStudent(StudentBean register)
	{
		Session se=sessionFactory.openSession();
		Transaction tx=se.beginTransaction();
		se.save(register);
		tx.commit();
		
		
		return true;
		
	}
	
}
