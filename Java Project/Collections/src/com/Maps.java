package com;

import java.util.*;

public class Maps {
	public static void main(String args[]) {
		HashMap map = new HashMap<>();
		map.put(111, "Mansi");
		map.put(222, "Bhavya");
		map.put(555, "Priyanka");
		map.put(333, "Kanishak");
		map.put(444, "Parvesh");
		map.put(444, "Prashant");
		
		Set s = map.entrySet();
		
		Iterator i =s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		LinkedHashMap lmap = new LinkedHashMap<>();
		lmap.put(111, "Mansi");
		lmap.put(222, "Bhavya");
		lmap.put(555, "Priyanka");
		lmap.put(333, "Kanishak");
		lmap.put(444, "Parvesh");
		lmap.put(444, "Prashant");
		
		Set set = lmap.entrySet();
		System.out.println("------------------------------------");
		Iterator i1 =set.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		TreeMap tmap = new TreeMap<>();
		tmap.put(111, "Mansi");
		tmap.put(222, "Bhavya");
		tmap.put(555, "Priyanka");
		tmap.put(333, "Kanishak");
		tmap.put(444, "Parvesh");
		tmap.put(444, "Prashant");
		
		Set sets = tmap.entrySet();
		System.out.println("------------------------------------");
		Iterator i2 =sets.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
}
