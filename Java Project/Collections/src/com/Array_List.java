package com;

import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;

public class Array_List {
	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(10.5);
		al.add("Ram");
		al.add('A');
		al.add(true);
		al.add(new Thread());
		al.add(new Date());
		System.out.println(al);
		System.out.println("----------------------------");
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("----------------------------");
		Iterator i =al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
}
