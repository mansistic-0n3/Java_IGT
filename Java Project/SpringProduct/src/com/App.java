package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Product e = (Product)context.getBean("prod");
		System.out.println(e);
//		e.display();

		System.out.println("--------------------------------------------------------------");
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Product p = (Product) factory.getBean("prod");
        p.display();

	}

}
