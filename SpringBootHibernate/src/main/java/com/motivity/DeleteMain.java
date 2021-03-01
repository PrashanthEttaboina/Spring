package com.motivity;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;


@Service
public class DeleteMain {
	
	@Autowired
	NinjaRepository nr;
	
	public void delete() {

		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Select what you want to delete \n1.Single Record \n2.All Records");
		if(sc.nextInt()==1)
		{
			String option = "";
			do
			{	
				System.out.println("enter id of Ninja to be deleted");
				nr.deleteById(sc.nextInt());
				System.out.println("Record Deleted");
				System.out.println("Do you want to continue (y/n): ");
				option = sc.next();
			}while(sc.next().equalsIgnoreCase("y"));
		}
		else if (sc.nextInt()==2)
		{
			
			nr.deleteAll();
			
				System.out.println("Records Deleted");
		}		
		
	}

}
