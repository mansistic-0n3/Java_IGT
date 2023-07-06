package com;
import java.util.Iterator;
import java.util.List; // Correct import for List
import java.util.Scanner;

 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class UpRecord {
	    public static void main(String[] args) {
	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");

	        SessionFactory factory = cfg.buildSessionFactory();

	        Session session = factory.openSession();

	        Transaction tx = session.beginTransaction();

	     // Read employee ID from user
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter employee ID: ");
	        int uid = scanner.nextInt();
	        scanner.nextLine(); // Consume newline character

	 

	        // Retrieve the employee record to update
	        Student stu = session.get(Student.class, uid);
	        if (stu == null) {
	            System.out.println("Employee with ID " + uid + " not found.");
	            tx.rollback();
	            session.close();
	            factory.close();
	            return;
	        }

	 

	        // Read new name and design from user
	        System.out.print("Enter new salary: ");
	        int nsal = scanner.nextInt();

	 

	        // Update the employee record
	        stu.setSal(nsal);
	        session.update(stu);
	        tx.commit();

	 

	        System.out.println("Record updated successfully.");

	 

	        scanner.close();
	        session.close();
	        factory.close();
	    }
	}