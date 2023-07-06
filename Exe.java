import java.util.Scanner;
class Exe{
	public static void main(String args[]){
		m1();
	}
	static void m1(){
		m2();
		System.out.println("M1");
	}
	static void m2(){
		m3();
		System.out.println("M2");
	}
	static void m3(){
		
		System.out.println("M3");
		Scanner sc= new Scanner(System.in);
	try{
		System.out.println("Enter A value");
		int a = sc.nextInt();
		System.out.println("Enter B value");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println("Result : "+c);
	}
	catch(ArithmeticException ae){
		System.out.println("Can't divide by 0!");
	}
	 catch(Exception e){
		System.out.println("Only numbers can be handled!");
	}
	}
}