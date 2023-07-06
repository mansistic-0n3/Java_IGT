package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID ");
		int id= sc.nextInt();
		
		System.out.println("Enter Name :");
		String name= sc.next();
		
		System.out.println("Enter Age ");
		int age= sc.nextInt();
		
		System.out.println("Enter Salary ");
		int salary= sc.nextInt();
		System.out.println("Enter Designation :");
		String desig= sc.next();
		
		s.setUid(id);
		s.setName(name);
		s.setAge(age);
		s.setDesig(desig);
		s.setSal(salary);
		
		session.save(s);
		tx.commit();
		
		System.out.println("Data inserted Successfully!");
	}

}
