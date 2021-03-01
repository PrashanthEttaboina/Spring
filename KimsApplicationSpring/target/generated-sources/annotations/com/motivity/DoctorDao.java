package com.motivity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class DoctorDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public DoctorBean doctorLogin(String email, String password) {
		Session se = sessionFactory.openSession();
		Query qe = se.createQuery("from DoctorBean d where d.email=:x and d.password=:y").setParameter("x", email).setParameter("y", password);
		List li = qe.list();
		se.close();
		if(li!=null)
			return (DoctorBean) li.get(0);
		return null;
	}

	public boolean registerDoctor(DoctorBean dregister) {
		Session se = sessionFactory.openSession();
		Transaction tx = se.beginTransaction();
		se.save(dregister);
		tx.commit();
		se.close();
		return true;
	}
	
	public DoctorBean updateDoctor(DoctorBean register) {
		Session se=sessionFactory.openSession();
		Transaction tx=se.beginTransaction();
		DoctorBean db=(DoctorBean)se.merge(register);
		tx.commit();
		se.close();
		return db;
	}
	
	public List<AppointmentBean> appointments(String specialisation) {
		Session se=sessionFactory.openSession();
		Query qe= se.createQuery("from AppointmentBean a where a.specialist = :x").setParameter("x", specialisation);
		List li =qe.list();
		return li;
	}

	public boolean acceptAppointment(String dname, int id) {
		Session se=sessionFactory.openSession();
		Transaction tx=se.beginTransaction();
		Query qe=se.createQuery("update AppointmentBean a set a.dname=:x,a.status=:y where a.id=:z").setParameter("x", dname).setParameter("y", "Accepted").setParameter("z", id);
		int a =qe.executeUpdate();
		tx.commit();
		if(a!=0) {
			return true;
		}
		else
			return false;
	}
	
	
}