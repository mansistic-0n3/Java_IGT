abstract class A{
	abstract void abc();
}
abstract class B extends A{
	void abc(){
		System.out.println("ABC");
	}
	abstract void xyz();
}
class C extends B{
	void xyz(){
		System.out.println("XYZ");
	}
}
class Abs{
	public static void main(String args[]){
		//A a = new A();
		//B b = new B();
		C c = new C();
		c.abc();
		c.xyz();
	}
}


//can't create object of abstract class