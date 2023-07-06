package com;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class Linked_List {
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(10.5);
		ll.add("ABC");
		ll.add('A');
		ll.add(true);
		ll.add(new Thread());
		ll.add(new Date());
		ll.addFirst(22);
		ll.addLast(99);
		
		System.out.println("----------------------------");
		Iterator i =ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
}
