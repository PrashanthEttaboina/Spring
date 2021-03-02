package com.motivity;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainOperator {
	
	@Autowired
	InsertMain im;
	
	@Autowired
	DisplayMain dm;
	
	@Autowired
	UpdateMain um;
	
	@Autowired
	DeleteMain delm;

	public void logic(){
		
			Scanner sc=new Scanner(System.in);
		
		int choice=0;
		do {
			System.out.println("========== Ninja Databook =========");
			System.out.println("Select your option\n 1. Add Ninja \n 2. Update Ninja \n 3. Display Ninja \n 4. Delete Ninja \n 5. Exit");
			choice=sc.nextInt();
			if(choice == 1) {
				
				im.insert();
			}
			else if(choice == 2) {
								um.update();
			}
			else if(choice == 3) {
				
				dm.display();
			}
			else if(choice == 4) {
			
				delm.delete();
			}
		}while(choice!=5);	
		
	}

	
}
