package com.motivity.SpringHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class InsertMain {

	HibernateTemplate htemplate;

	public HibernateTemplate getHtemplate() {
		return htemplate;
	}

	public void setHtemplate(HibernateTemplate htemplate) {
		this.htemplate = htemplate;
	}
	
	public void insert()
	{
		Session se = getHtemplate().getSessionFactory().openSession();
		Scanner sc = new Scanner(System.in);
		String choice = "";
		do {
			Transaction tx = se.beginTransaction();
			Ninja n=new Ninja();
			System.out.println("enter Ninja id: ");
			n.setId(sc.nextInt());sc.nextLine();
			System.out.println("enter name :");
			n.setName(sc.nextLine()); 
			System.out.println("Enter parent name :");
			n.setParentname(sc.nextLine());
			
			System.out.println("Enter age :");
			n.setAge(sc.nextInt());sc.nextLine();
			System.out.println("Enter the squad number :");
			n.setSquadno(sc.nextInt());sc.nextLine();
			
			System.out.println("Enter Village name : ");
			n.setVillage(sc.nextLine());
			
			Object o = se.save(n);
			tx.commit();
			if (o != null) {
				System.out.println("Record inserted");
			}
			System.out.println("Do you want to continue (y/n): ");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("y"));
		se.close();
	}
	
	
}
