package com.motivity.SpringJdbcTemplate;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;


public class InsertLogic {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate	(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insert() {
	
		
		Scanner sc=new Scanner(System.in);
		String choice="";
		do {
			
			System.out.println("Enter the name of the Pirate : ");
			final String name=sc.nextLine();
			System.out.println("Enter the Father name of the pirate : ");
			final String fathername=sc.nextLine();
			System.out.println("Enter the Job of the Priate : ");
			final String job=sc.nextLine();
			System.out.println("Enter the Bounty of the Pirate : ");
			final String bounty=sc.nextLine();
			System.out.println("Enter the Crew name  of the Pirate : ");
			final String crew=sc.nextLine();
			
			String sql="insert into pirates(name,fathername,job,bounty,crew_name) values(?,?,?,?,?)";
			int i= jdbcTemplate.update(sql, new PreparedStatementSetter() {

				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setString(1,name);
					ps.setString(2,fathername);
					ps.setString(3,job);
					ps.setString(4,bounty);
					ps.setString(5,crew);
					
				}				
			});
			if(i>0)
				System.out.println("record inserted ");
			System.out.println("Do you want to insert more records ?(y/n): ");
			choice = sc.nextLine();
			
		}while(choice.equalsIgnoreCase("y"));
						
	}
	
}
