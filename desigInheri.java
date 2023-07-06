import java.util.Scanner;

	class Employee{
	String name;	
	int id;
	int age;
	
	Employee(){
	Scanner sc = new Scanner(System.in);
	System.out.println("-----------------------");
        System.out.print("Enter your name: ");
     	name = sc.next();
    	System.out.print("Enter your id: ");
     	id = sc.nextInt();
    	System.out.print("Enter your age: ");
     	age = sc.nextInt();
    	System.out.println("");
	}
}

class ClerkEmp extends Employee{
    
	String desg="Clerk";
	float salary=20000;
    void display(){
        System.out.println("Name: " +name);
        System.out.println("ID: " +id);
        System.out.println("Age: " +age);
        System.out.println("Designation: " +desg);
        System.out.println("Salary: " +salary);
        System.out.println("");
    }
}

 

class ManagerEmp extends Employee{
    	String desg="Manager";
	float salary=40000;
    void display(){
        System.out.println("Name: " +name);
        System.out.println("ID: " +id);
        System.out.println("Age: " +age);
        System.out.println("Designation: " +desg);
        System.out.println("Salary: " +salary);
        System.out.println("");
    }
}

 

class DeveloperEmp extends Employee{
	String desg="Developer";
	float salary=34000;
    void display(){
        System.out.println("Name: " +name);
        System.out.println("ID: " +id);
        System.out.println("Age: " +age);
        System.out.println("Designation: " +desg);
        System.out.println("Salary: " +salary);
        System.out.println("");
    }
}

 

class TesterEmp extends Employee{
    	String desg="Tester";
	float salary=50000;
    void display(){
        System.out.println("Name: " +name);
        System.out.println("ID: " +id);
        System.out.println("Age: " +age);
        System.out.println("Designation: " +desg);
        System.out.println("Salary: " +salary);
        System.out.println("");
    }
}

 

 

class desigInheri{
    public static void main(String[] args) {

    System.out.println("1. Manager");
    System.out.println("2. Developer");
    System.out.println("3. Tester");
    System.out.println("4. Clerk");
    System.out.println("");

    Scanner sc = new Scanner(System.in);
    System.out.print("What's your Designation : ");
    int num = sc.nextInt();
    if(num == 1){
        ManagerEmp manager = new ManagerEmp();
        manager.display();
    }
    if(num==2){
        DeveloperEmp developer = new DeveloperEmp();
        developer.display();
    }
    if(num==3){
        TesterEmp tester = new TesterEmp();
        tester.display();
    }
    if(num==4){
        ClerkEmp clerk = new ClerkEmp();
        clerk.display();
    }

    }
}