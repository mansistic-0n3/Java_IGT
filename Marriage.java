import java.util.Scanner;
import  java.util.InputMismatchException;
class Age{
	void girl() throws InvalidAgeException, OldException {
		System.out.println("Enter your age");
		try{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a<18){
			 throw new InvalidAgeException("YOU ARE UNDERAGE!!!\nValid age for boys to get marriwed is 18.");
		}else if(a>100){
			throw new OldException("You are going to die soon!");
		}else{
			System.out.println("YAY! Ready to get married.");
		}
		}catch(InputMismatchException ime){
			System.out.println("Age must be a numeric value.");
		}
		
	}

	void boy() throws InvalidAgeException, OldException {
		System.out.println("Enter your age");
		try{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a<21){
			 throw new InvalidAgeException("YOU ARE UNDERAGE!!!\nValid age for boys to get married is 21.");
		}else if(a>100){
			throw new OldException("You are going to die soon!");
		}else{
			System.out.println("YAY! Ready to get married.");
		}
		}catch(InputMismatchException ime){
			System.out.println("Age must be a numeric value.");
		}
		
	}
}

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}

class OldException extends Exception{
	OldException(String msg){
		super(msg);
	}
}

class Marriage{
	public static void main(String args[]){
	   try{
		Age age = new Age();
		System.out.println("Enter your gender ( Male / Female )");
		Scanner sc = new Scanner(System.in);
		String gen = sc.next();
		if(gen.equalsIgnoreCase("male")){
			age.boy();
		}else if(gen.equalsIgnoreCase("female")){
			age.girl();
		}else{
			System.out.println("Invalid gender!");
		}
	      }
	   catch(InvalidAgeException iae){
			System.out.println(iae);
		}

	   catch(OldException oe){
			System.out.println(oe);
		}
	
	}
}
