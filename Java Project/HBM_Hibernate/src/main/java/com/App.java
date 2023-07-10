package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory=cfg.buildSessionFactory();
		
		
		Session sesion=factory.openSession();

		Transaction tx= sesion.beginTransaction();

		Worker w = new Worker();
		Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter  ID : ");
			int pid=sc.nextInt();		
			
			System.out.println("Enter First Name :");
			String fname=sc.next();
			
			System.out.println("Enter Last name  : ");
			String lname=sc.next();
			
			w.setId(pid);
			w.setFirstName(fname);
			w.setLastName(lname);
			
			sesion.save(w);
			tx.commit();
			
			System.out.println("Saved Succcessfully...!");
			

	}

}