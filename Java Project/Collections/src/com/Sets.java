package com;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashSet;

public class Sets {
	public static void main(String args[]) {
	HashSet hs = new HashSet();
	hs.add(100);
	hs.add(200);
	hs.add(300);
	hs.add(400);
	hs.add(10.5);
	hs.add("ABC");
	hs.add('A');
	hs.add(true);
	hs.add(new Thread());
	hs.add(new Date());
	
	LinkedHashSet lhs = new LinkedHashSet();
	lhs.add(100);
	lhs.add(200);
	lhs.add(300);
	lhs.add(400);
	lhs.add(10.5);
	lhs.add("ABC");
	lhs.add('A');
	lhs.add(true);
	lhs.add(new Thread());
	lhs.add(new Date());
	
	TreeSet ts = new TreeSet();
//	ts.add(100);
//	ts.add(200);
//	ts.add(300);
//	ts.add(400);
	ts.add("ABC");
	ts.add("XYZ");
	ts.add("PQR");
	ts.add("LMN");
	
	System.out.println("----------------------------");
	Iterator i =hs.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	System.out.println("----------------------------");
	Iterator i1 =lhs.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	
	System.out.println("----------------------------");
	Iterator i2 =ts.iterator();
	while(i2.hasNext()) {
		System.out.println(i2.next());
	}
}
}
