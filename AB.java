class A {
	A(){
		System.out.println("Class A");
		//if child class object is created parent class constructor is called...
	}
}
class B extends A {
	B(){
		System.out.println("Class B");
	}
}
class AB {
	public static void main(String args[]){
		B b = new B();
	}
}