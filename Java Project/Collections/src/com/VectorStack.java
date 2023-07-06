package com;

import java.util.*;

public class VectorStack {
	public static void main(String args[]) {
		//LinkedList ll = new LinkedList();
		Vector v = new Vector<>();
		Stack s = new Stack<>();
		v.add(100);
		s.add(200);
		v.add(10.5);
		v.add("ABC");
		s.add('A');
		s.add(true);
		v.contains("ABC");
		s.peek();
		s.pop();
		s.push(99);
		
		System.out.println("----------------------------");
		Iterator i1 =v.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("----------------------------");
		Iterator i2 =s.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
	
}
