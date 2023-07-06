package com;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Project
{
	 public static void main(String[] args) {
		 
		 	Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory factory=cfg.buildSessionFactory();
			
			Session session = factory.openSession();
			
			Transaction tx = session.beginTransaction();
			Student s = new Student();
			
	        Scanner sc = new Scanner(System.in);
	        int ch=0;
	        
	        do {
	            System.out.println("Enter choice ");
	             System.out.println("1) ADD RECORD ");
	             System.out.println("2) Display Record ");
	             System.out.println("3) UPDATE");
	             System.out.println("4) DELETE");
	             System.out.println("5) Exit");
	             
	             ch=sc.nextInt();
	             
	             if(ch==1) {
	            	 System.out.println("Enter ID ");
	     			int id= sc.nextInt();
	     			System.out.println("Enter Name :");
	     			String name= sc.next();
	     			System.out.println("Enter Age :");
	     			int age= sc.nextInt();
	     			System.out.println("Enter Salary :");
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
	             
	             else if(ch==2) {
	            	 System.out.println("Enter ID ");
	     			int id= sc.nextInt();
	     			List stu = session.createQuery("from Student").list();
	     			Iterator i = stu.iterator();
	     			while(i.hasNext()) {
	     				Student st =  (Student)i.next();
	     				if(st.getUid()==id) {
	     				System.out.println("Your information-");
	     				System.out.println(st.getUid());
	     				System.out.println(st.getName());
	     				System.out.println(st.getDesig());
	     				System.out.println(st.getAge());
	     				System.out.println(st.getSal());
	     				}else {
	     					System.out.println("No record found!");
	     				}
	     			}
	             }    
	             
	             else if(ch==3) {
	            	 Scanner scanner = new Scanner(System.in);
	     	        System.out.print("Enter Student ID: ");
	     	        int uid = scanner.nextInt();
	     	        scanner.nextLine(); 
	     	        Student stu = session.get(Student.class, uid);
	     	        if (stu == null) {
	     	            System.out.println("Student with ID " + uid + " not found.");
	     	            tx.rollback();
	     	            session.close();
	     	            factory.close();
	     	            return;
	     	        }
	     	        System.out.print("Enter new salary: ");
	     	        int nsal = scanner.nextInt();
	     	        stu.setSal(nsal);
	     	        session.update(stu);
	     	        tx.commit();
	     	        System.out.println("Record updated successfully.");
	             }
	             
	             else if(ch==4) {
	            	 System.out.println("Enter ID ");
	         		int id= sc.nextInt();
	         		s.setUid(id);
	         		session.delete(s);
	         		tx.commit();
	         		System.out.println("Data deleted Successfully!");
	             }
	             
	             else if(ch==5) {
	            	 System.out.println("Thankyou! ");
	            	 System.exit(0);
	             }
	             
	             else {
		             System.out.println("Invalid choice!");
	             }

	        }while(ch<6);
	 
	    }
	
}