package com;

public class Product {
	private int pid;
	private String name;
	private int price;
	private String desc;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void display() {
		System.out.println("Your Product Id is "+pid);
		System.out.println("Your order is a "+name);
		System.out.println("It is a "+desc);
		System.out.println("Cost : Rs"+price);
		
	}
	
	@Override
	public String toString() {
		return "Product : "+pid+" - "+name +" ("+desc+") "+ "which costs Rs."+price ;
		
	}
}
