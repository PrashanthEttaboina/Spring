package com.motivity;



import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DeleteLogic {

	@Autowired
JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public  void delete() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of the record to be deleted");
		int id=sc.nextInt();
		int x=jdbcTemplate.update("delete from pirates where sid=?",id);
		
		if(x>0)
			System.out.println("Record Deleted");
	}

}
