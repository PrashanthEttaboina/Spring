package com.motivity.SpringHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class DeleteMain {
	HibernateTemplate htemplate;

	public HibernateTemplate getHtemplate() {
		return htemplate;
	}

	public void setHtemplate(HibernateTemplate htemplate) {
		this.htemplate = htemplate;
	}
	
	public void delete() {
		
		Session se = getHtemplate().getSessionFactory().openSession();
		Scanner sc = new Scanner(System.in);
		Transaction tx=se.beginTransaction();
	
		
		System.out.println("Select what you want to delete \n1.Single Record \n2.All Records");
		if(sc.nextInt()==1)
		{
			do
			{	
			Query qr=se.createQuery("delete from Ninja n where n.id=:x");
			System.out.println("Enter the id of record to be deleted ");
			qr.setParameter("x",sc.nextInt());
			int y=qr.executeUpdate();
			if(y>0)
				System.out.println("Record deleted");
			
			System.out.println("Do you want to continue the deleting process ?(y/n)");
			tx.commit();
			}while(sc.next().equalsIgnoreCase("y"));
		}
		else if (sc.nextInt()==2)
		{
			Query qr=se.createQuery("delete from ninja n");
			int x = qr.executeUpdate();
			tx.commit();
			if (x>0)
				System.out.println("All the Records are deleted");
		}		
		
	}

}
