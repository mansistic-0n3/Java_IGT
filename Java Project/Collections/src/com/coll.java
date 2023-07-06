package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class coll {
	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add("ABC");
		al.add(true);
		al.add(new Date());
		
		Iterator i =al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("----------------------------");
		System.out.println(al.contains(100));
		System.out.println(al.size());
		System.out.println(al.remove(0));
		System.out.println(al.isEmpty());
		System.out.println(al);
	}
}
