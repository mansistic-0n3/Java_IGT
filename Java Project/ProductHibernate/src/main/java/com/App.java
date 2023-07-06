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
		
		Product p = new Product();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Product ID ");
//		int id= sc.nextInt();
		System.out.println("Enter Product Name :");
		String name= sc.next();
		System.out.println("Enter Price ");
		int price= sc.nextInt();
		System.out.println("Enter Description :");
		String des= sc.next();
		
//		p.setId(id);
		p.setName(name);
		p.setPrice(price);
		p.setDes(des);
		
		session.save(p);
		tx.commit();
		
		System.out.println("Product Added!");

	}

}
