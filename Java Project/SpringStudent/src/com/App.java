package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class App {
	public static void main(String args[]) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
	    Student s = (Student) factory.getBean("stu");
	    s.display();
	}
    
}
