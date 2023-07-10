package com;

public class Student {
	private int sid;
	private String name;
	private int marks;
	private String course;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void display() {
		System.out.println("Id: "+sid);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
		System.out.println("Course: "+course);
		
	}
	
}
