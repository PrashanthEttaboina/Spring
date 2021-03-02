package com.motivity;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

@Service
public class DisplayMain {

	@Autowired
	NinjaRepository nr;
	
	public void display() {
		
			Scanner sc = new Scanner(System.in);
				
		do
		{
		System.out.println("Enter your choice \n 1.Retrieve all records \n 2. Retrieve sinlge Record ");
		if(sc.nextInt()==1)
		{
			List l=nr.findAll();
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
			Optional<Ninja> o=nr.findById(x);

			Ninja n=o.get();
			
			System.out.println("Ninja id="+n.getId()+"\nName= "+n.getName()+"\nParent Name= "+n.getParentname()+"\nVillage= "+n.getVillage()+"\nAge= "+n.getAge());	

		}
		System.out.println("Do you want to continue the retriving process ? (y/n)");
		
		}while(sc.next().equalsIgnoreCase("y"));
	}

}
