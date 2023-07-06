import java.util.Scanner;
class Emp
{
	int id;
	String name;
	Scanner sc = new Scanner(System.in);
	Emp(){
		System.out.println("-----------------------");
		System.out.println("Enter ID:");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name:");
		name = sc.nextLine();
	}
}
class Clerk extends Emp
{
	void display(){
		System.out.println("CLERK");
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
	}
}
class Dev extends Emp
{
	void display(){
		System.out.println("DEVELOPER");
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
	}
}
class Tester extends Emp
{
	void display(){
		System.out.println("TESTER");
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
	}
}
class Inheri
{
	public static void main(String args[]){
		
		Clerk c = new Clerk();
		c.display();

		Dev d = new Dev();
		d.display();

		Tester t = new Tester();
		t.display();
	}
}