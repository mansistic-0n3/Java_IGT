import java.util.Scanner;

class maxThree{
	public static void main(String args[]){
		System.out.println("Enter first number :");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("Enter second number :");
		int b= sc.nextInt();
		System.out.println("Enter third number :");
		int c= sc.nextInt();

		if(a > b && a > c){
		System.out.println("Greatest from "+a+", "+b+" and "+c+ " is "+a);
		}else if(b>a && b>c){
		System.out.println("Greatest from "+a+", "+b+" and "+c+ " is "+b);
		}else{
		System.out.println("Greatest from "+a+", "+b+" and "+c+ " is "+c);
		}
	}
}