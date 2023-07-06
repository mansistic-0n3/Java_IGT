import java.util.Scanner;

class maxTwo{
	public static void main(String args[]){
		System.out.println("Enter first number :");
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		System.out.println("Enter second number :");
		int two = sc.nextInt();

		if(one > two){
		System.out.println(one+" is greater than "+two);
		}else{
		System.out.println(two+" is greater than "+one);
		}
	}
}