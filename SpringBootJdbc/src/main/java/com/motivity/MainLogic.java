package com.motivity;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainLogic {

	@Autowired
	InsertLogic il;
	
	@Autowired
	DisplayLogic disl;
	
	@Autowired
	UpdateLogic ul;
	
	@Autowired
	DeleteLogic dl;
	
	public void Logics() {
				Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("========== One Piece Pirates =========");
			System.out.println("Select your option\n 1. Add Pirate \n 2. Update Priate \n 3. Display Pirate \n 4. Delete Pirate \n 5. Exit");
			choice=sc.nextInt();
			if(choice == 1) {
				il.insert();
			}
			else if(choice == 2) {
				ul.update();
			}
			else if(choice == 3) {
				disl.display();
			}
			else if(choice == 4) {
				dl.delete();
			}
		}while(choice!=5);		
	}
}
