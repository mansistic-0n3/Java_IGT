import java.util.Scanner;

class countString{
	public static void main(String args[]){
		System.out.println("Write a word to know its length :");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		int count =0;
		for(int i =0;i< word.length();i++){
			count++;
		}

		System.out.println("Total number of characters in word "+word+" : "+count);
	}
}