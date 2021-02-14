package com.motivity.SpringHibernate;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;


public class DisplayMain {

	
	HibernateTemplate htemplate;

	public HibernateTemplate getHtemplate() {
		return htemplate;
	}

	public void setHtemplate(HibernateTemplate htemplate) {
		this.htemplate = htemplate;
	}
	
	public void display() {
		
		Session se = getHtemplate().getSessionFactory().openSession();
		Scanner sc = new Scanner(System.in);
		Transaction tx=se.beginTransaction();
				
		do
		{
		System.out.println("Enter your choice \n 1.Retrieve all records \n 2. Retrieve sinlge Record ");
		if(sc.nextInt()==1)
		{
			Query qr=se.createQuery("from Ninja n");
			List<Ninja> l=qr.list();
			Iterator<Ninja> i=l.iterator();
			while(i.hasNext())
			{
				Ninja n=i.next();
				System.out.println("Ninja id="+n.getId()+"\nName= "+n.getName()+"\nParent Name= "+n.getParentname()+"\nVillage= "+n.getVillage()+"\nAge= "+n.getAge());	
			}
		}
		else if(sc.nextInt()==2)
		{
			System.out.println("Enter the id of the record you want to retrieve");
			int x=sc.nextInt();
			Ninja n=se.load(Ninja.class, x);

			System.out.println("Ninja id="+n.getId()+"\nName= "+n.getName()+"\nParent Name= "+n.getParentname()+"\nVillage= "+n.getVillage()+"\nAge= "+n.getAge());	

		}
		System.out.println("Do you want to continue the retriving process ? (y/n)");
		
		}while(sc.next().equalsIgnoreCase("y"));
	}

}
