//Method OVERRIDING
class A{
	void display(){
		System.out.println("Hi");
	}
}
class B{
	void display(){
		System.out.println("Hey");
	}
}
class Greet{
	public static void main(String args[]){
		B b = new B();
		b.display();
	}
}