import java.util.Scanner;
class Reverse{
	String b="";
	String rev(String a){
		for (int i = 0; i < a.length(); i++) {
  			b = a.charAt(i) + b;
			
		}
		return b;	
	}
}


class RevPeli{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String a = sc.next();
		Reverse r = new Reverse();
		String b=r.rev(a);
		System.out.println("Reverse of word  "+a+"  is "+b);
		if(a.equals(b)){
			System.out.println(a+" is a pelindrome!");
		}else{
			System.out.println(a+" is not a pelindrome!");
		}
	}
}