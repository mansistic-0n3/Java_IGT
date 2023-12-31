package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UpdateRecord {

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
		
		System.out.println("Enter Salary ");
		int salary= sc.nextInt();
		
		String n=s.getName();
		int a=s.getAge();
		String d=s.getDesig();
		
		s.setUid(id);
		s.setName(n);
		s.setAge(a);
		s.setDesig(d);
		s.setSal(salary);
		System.out.println();
		System.out.println();
		
		session.update(s);
		tx.commit();
		
		System.out.println("Data updated Successfully!");
	}

}
