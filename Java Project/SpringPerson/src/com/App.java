package com;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = (Person)context.getBean("per");
		System.out.println(p.getPid() +" : "+ p.getName());
		
		String[] hb = p.getHobbies();
		System.out.println("Technical Skills-");
		for(String s:hb) {
			System.out.println("  "+s);
		}
		
		ArrayList<String> em = p.getEmails();
		System.out.println("Emails-");
		for(String s: em) {
			System.out.println("  "+s);
		}
		
		HashSet<String> ph = p.getPhones();
		System.out.println("Phones-");
		for(String s: ph) {
			System.out.println("  "+s);
		}
		
		HashMap<String, String> ed = p.getEducation();
		System.out.println("Education Details-");
		Iterator it = ed.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println("  "+it.next());
		}
	}

}
