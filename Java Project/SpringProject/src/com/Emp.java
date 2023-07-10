package com;

public class Emp {

	private int uid;
	private String name;
	private int age;
	private int sal;
	private String desig;
	
	public Emp(int uid, String name, int age, int sal, String desig) {
		super();
		this.uid = uid;
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.desig = desig;
	}
	
	public void display() {
		System.out.println("ID: "+uid);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Sal: "+sal);
		System.out.println("Designation: "+desig);
		
	}
	
	
}
