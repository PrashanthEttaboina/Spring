package com.motivity.SpringHibernate;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class UpdateMain {

	HibernateTemplate htemplate;

	public HibernateTemplate getHtemplate() {
		return htemplate;
	}

	public void setHtemplate(HibernateTemplate htemplate) {
		this.htemplate = htemplate;
	}

	public void update() {
		Session se = getHtemplate().getSessionFactory().openSession();
		Scanner sc = new Scanner(System.in);
		Transaction tx=se.beginTransaction();
		int option = 0, x = 0;

		do {

			System.out.println(
					"Enter the option you want to update \n1.Name \n2.Parent name \n3.Age \n4.Village \n5.Squadno ");
			option = sc.nextInt();
			if (option == 1) {
				Query qr = se.createQuery("update Ninja n set n.name=:x where n.id=:y");
				System.out.println("Enter the id where you want to update name ");
				qr.setParameter("y", sc.nextInt());sc.nextLine();
				System.out.println("Enter new name :");
				qr.setParameter("x", sc.nextLine());

				x = qr.executeUpdate();
				if (x > 0)
					System.out.println(" Details Updated ");

			} else if (option == 2) {
				Query qr = se.createQuery("update Ninja n set n.parentname=:x where n.id=:y");
				System.out.println("Enter the id where you want to update Parent name ");
				qr.setParameter("y", sc.nextInt());sc.nextLine();
				System.out.println("Enter new name :");
				qr.setParameter("x", sc.nextLine());
				x = qr.executeUpdate();
				if (x > 0)
					System.out.println(" Details Updated ");
			} else if (option == 3) {

				Query qr = se.createQuery("update Ninja n set n.age=:x where n.id=:y");
				System.out.println("Enter the id where you want to update age ");
				qr.setParameter("y", sc.nextInt());sc.nextLine();
				System.out.println("Enter new age :");
				qr.setParameter("x", sc.nextInt());
				x = qr.executeUpdate();
				if (x > 0)
					System.out.println(" Details Updated ");
				
			} else if (option == 4) {
				
				Query qr = se.createQuery("update Ninja n set n.village=:x where n.id=:y");
				System.out.println("Enter the id where you want to update village ");
				qr.setParameter("y", sc.nextInt());sc.nextLine();
				System.out.println("Enter new village :");
				qr.setParameter("x", sc.nextLine());
				x = qr.executeUpdate();
				if (x > 0)
					System.out.println(" Details Updated ");
				
			} else if (option == 5) {
				Query qr = se.createQuery("update Ninja n set n.squadno=:x where n.id=:y");
				System.out.println("Enter the id where you want to update squadno ");
				qr.setParameter("y", sc.nextInt());sc.nextLine();
				System.out.println("Enter new squadno :");
				qr.setParameter("x", sc.nextInt());
				x = qr.executeUpdate();
				if (x > 0)
					System.out.println(" Details Updated ");
			}
			
			tx.commit();
			System.out.println("Do you want to continue the update procedure ?(y/n)");
		} while (sc.next().equalsIgnoreCase("y"));

	}

}
