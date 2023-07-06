
	package com;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;


	public class ReadRecord {

		public static void main(String[] args) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory factory=cfg.buildSessionFactory();
			
			Session session = factory.openSession();
			
			Transaction tx = session.beginTransaction();
			
//			 Student e=session.load(Student.class, 111);
//		        System.out.println("=============");
//		        System.out.println("UID :"+e.getUid());
//		        System.out.println("U Name :"+e.getName());
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID ");
			int id= sc.nextInt();
			List stu = session.createQuery("from Student").list();
			Iterator i = stu.iterator();
			
			while(i.hasNext()) {
				Student s =  (Student)i.next();
				if(s.getUid()==id) {
				System.out.println(s.getUid());
				System.out.println(s.getName());
				System.out.println(s.getDesig());
				System.out.println(s.getAge());
				System.out.println(s.getSal());
				}else {
					System.out.println("No record found!");
				}
			}
			
		}

	}
