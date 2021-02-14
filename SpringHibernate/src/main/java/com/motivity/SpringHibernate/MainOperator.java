package com.motivity.SpringHibernate;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainOperator {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context =new AnnotationConfigApplicationContext(Configure.class);
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		do {
			System.out.println("========== Ninja Databook =========");
			System.out.println("Select your option\n 1. Add Ninja \n 2. Update Ninja \n 3. Display Ninja \n 4. Delete Ninja \n 5. Exit");
			choice=sc.nextInt();
			if(choice == 1) {
				InsertMain il=(InsertMain) context.getBean("insertbean");
				il.insert();
			}
			else if(choice == 2) {
				UpdateMain ul=(UpdateMain) context.getBean("updatebean");
				ul.update();
			}
			else if(choice == 3) {
				DisplayMain dl=(DisplayMain) context.getBean("displaybean");
				dl.display();
			}
			else if(choice == 4) {
				DeleteMain dl=(DeleteMain) context.getBean("deletebean");
				dl.delete();
			}
		}while(choice!=5);	
		
	}

}
