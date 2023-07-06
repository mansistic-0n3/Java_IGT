import java.util.Scanner;
class Swap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Before swapping numbers were :\nI : "+a+"\t\tII : "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After swapping numbers were :\nI : "+a+"\t\tII : "+b);
	}
}