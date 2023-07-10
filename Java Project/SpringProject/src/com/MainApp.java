package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Employee e = (Employee)context.getBean("emp");
		System.out.println("------Constructor------");
		Emp e = (Emp)context.getBean("employee");
		e.display();

		System.out.println("------Setter / Getter------");
		Employee e1 = (Employee)context.getBean("emp");
//		Emp e = (Emp)context.getBean("employee");
		e1.display();
	}
}
