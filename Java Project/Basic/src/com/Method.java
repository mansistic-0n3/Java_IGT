package com;

interface Bank{
	void loan();
	default void OT() {
		System.out.println("HI OT method");
	}
	static void withdraw() {
		System.out.println("HI withdraw method");
		}
}

class Sbi implements Bank{
    @Override
    public void loan() {

    }
}

class Axis implements Bank{
    @Override
    public void loan() {

    }
}

public class Method {
	public static void main(String args[]) {
		Sbi s = new Sbi();
		s.OT(); //default- create obj
		Bank.withdraw();// no obj needed
	}
}
