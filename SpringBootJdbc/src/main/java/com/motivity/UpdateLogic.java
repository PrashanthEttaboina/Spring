package com.motivity;


import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UpdateLogic {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void update() {
		
		Scanner sc=new Scanner(System.in);
		int option=0,x=0;
		
		do {
			
			System.out.println("Enter the option you want to update \n1.Pirate Name \n2.Father name \n3.Job \n4.Bounty \n5.Crew ");
			option=sc.nextInt();
			if(option==1)
			{
				String qr="update pirates set name=? where sid=?";
				System.out.println("Enter new name :");
				String name=sc.nextLine();
				System.out.println("Enter the id where you want to update name ");
				int id=sc.nextInt();
				updatequery(qr,id,name);
					
			}
			else if(option==2)
			{
				String qr="update pirates set fathername=? where sid=?";
				System.out.println("Enter the id where you want to update Father name ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new name :");
				String name=sc.nextLine();
				updatequery(qr,id,name);
			}
			else if(option==3)
			{
				String qr="update pirates set job=? where sid=?";
				System.out.println("Enter the id where you want to update Job ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new job :");
				String job=sc.nextLine();
				updatequery(qr,id,job);
			}
			else if(option==4)
			{
				String qr="update pirates set bounty=? where sid=?";
				System.out.println("Enter the id where you want to update Bounty ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new Bounty :");
				String bounty=sc.nextLine();
				updatequery(qr,id,bounty);
			}
			else if(option==5)
			{
				String qr="update pirates set crew_name=? where sid=?";
				System.out.println("Enter the id where you want to update Crew ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new Crew :");
				String crew=sc.nextLine();
				updatequery(qr,id,crew);
			}
			System.out.println("Do you want to continue the update procedure ?(y/n)");
		}while(sc.next().equalsIgnoreCase("y"));
		
	}

	private void updatequery(String qr, int id, String name) {
		int x=jdbcTemplate.update(qr,name,id);
		if (x>0)
			System.out.println("Record updated");	
		
	}

}
