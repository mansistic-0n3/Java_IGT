class A{
	static int x =10;
	static void abc(){
		System.out.println("ABC");
	}
}

class StaticClass{
	public static void main(String args[]){
		//A a = new A();
		//a.abc;
		//System.out.println("X : "+a.x);

		A.abc();
		System.out.println("X : "+A.x);
	}
}

// static : doesn't belong to object
// can be accessed without creating an object