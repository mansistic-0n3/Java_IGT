package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DelRecord {

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
		
		s.setUid(id);
		
		session.delete(s);
		tx.commit();
		
		System.out.println("Data deleted Successfully!");
	}

}
