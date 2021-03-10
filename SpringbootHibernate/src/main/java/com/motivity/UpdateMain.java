package com.motivity;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

@Service
public class UpdateMain {

	HibernateTemplate htemplate;
	@Autowired
	NinjaRepository nr;
	

	public void update() {
		
		Scanner sc = new Scanner(System.in);
		
		int option = 0, a = 0;

		do {

			System.out.println(
					"Enter the option you want to update \n1.Name \n2.Village");
			option = sc.nextInt();
			if (option == 1) {
				
				System.out.println("Enter new name:");
				String name=sc.next();
				System.out.println("enter the id to which name to be updated: ");
				int id = sc.nextInt();
				a =nr.updateName(name,id);
				if (a == 1)
					System.out.println("Record updated");
			} 
				else if (option == 2) 
				{
					System.out.println("Enter new Village name :");
					String village=sc.next();
					System.out.println("enter the id to which name to be updated: ");
					int id=sc.nextInt();
					a =nr.updateVillage(village,id);
					if (a == 1)
						System.out.println("Record updated");
					
					
				}
			
			
			
//				System.out.println(" Details Updated ");
//				Query qr = se.createQuery("update Ninja n set n.parentname=:x where n.id=:y");
//				System.out.println("Enter the id where you want to update Parent name ");
//				qr.setParameter("y", sc.nextInt());sc.nextLine();
//				System.out.println("Enter new name :");
//				qr.setParameter("x", sc.nextLine());
//				x = qr.executeUpdate();
//				if (x > 0)
//					System.out.println(" Details Updated ");
//			} else if (option == 3) {
//
//				Query qr = se.createQuery("update Ninja n set n.age=:x where n.id=:y");
//				System.out.println("Enter the id where you want to update age ");
//				qr.setParameter("y", sc.nextInt());sc.nextLine();
//				System.out.println("Enter new age :");
//				qr.setParameter("x", sc.nextInt());
//				x = qr.executeUpdate();
//				if (x > 0)
//					System.out.println(" Details Updated ");
//				
//			} else if (option == 4) {
//				
//				Query qr = se.createQuery("update Ninja n set n.village=:x where n.id=:y");
//				System.out.println("Enter the id where you want to update village ");
//				qr.setParameter("y", sc.nextInt());sc.nextLine();
//				System.out.println("Enter new village :");
//				qr.setParameter("x", sc.nextLine());
//				x = qr.executeUpdate();
//				if (x > 0)
//					System.out.println(" Details Updated ");
//				
//			} else if (option == 5) {
//				Query qr = se.createQuery("update Ninja n set n.squadno=:x where n.id=:y");
//				System.out.println("Enter the id where you want to update squadno ");
//				qr.setParameter("y", sc.nextInt());sc.nextLine();
//				System.out.println("Enter new squadno :");
//				qr.setParameter("x", sc.nextInt());
//				x = qr.executeUpdate();
//				if (x > 0)
//					System.out.println(" Details Updated ");
		//}
			
			
			System.out.println("Do you want to continue the update procedure ?(y/n)");
		} while (sc.next().equalsIgnoreCase("y"));

	}

}
