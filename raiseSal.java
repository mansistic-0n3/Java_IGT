import java.util.Scanner;

//INHERITANCE and abstract
import java.util.Scanner;
interface Cab{
	public abstract void cab();
}
abstract class Emp
{
    int id;
    String name;
    String desig;
    int salary;
    int age;
    Scanner sc= new Scanner(System.in);
    Emp()
    {
        System.out.print("Enter ID: ");
        id= sc.nextInt();

        System.out.print("Enter Name :");
        name= sc.next();

        System.out.print("Enter Age: ");
        age= sc.nextInt();
    }
    void display()
    {
        System.out.println("========================");
        System.out.println("ID :"+id);
        System.out.println("NAME :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary:"+salary);
        System.out.println("Designation :"+desig);
    }

    abstract void raise();

}
final class Clerk extends Emp implements Cab

{
    String desig="CLERK";
    int salary=20000;

    void display()
    {
        System.out.println("========================");
        System.out.println("ID :"+id);
        System.out.println("NAME :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary:"+salary);
        System.out.println("Designation :"+desig);
    }

    @Override
    void raise() {
        salary = salary+10000;
	System.out.println("Raise :"+10000);
	System.out.println("Updated Salary:"+salary);
    }

   public void cab(){
	System.out.println("Cab Available");
	}

}

final class Developer extends Emp implements Cab
{
    String desig="Deverloper";
    int salary=40000;
    void display()
    {
        System.out.println("========================");
        System.out.println("ID :"+id);
        System.out.println("NAME :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary:"+salary);
        System.out.println("Designation :"+desig);
    }

    @Override
    void raise() {
        salary = salary+15000;
	System.out.println("Raise :"+15000);
	System.out.println("Updated Salary:"+salary);
    }

	public void cab(){
	System.out.println("Cab Available");
	}

}

final class Tester extends Emp implements Cab
{
    String desig="Tester";
    int salary=60000;
    void display()
    {
        System.out.println("========================");
        System.out.println("ID :"+id);
        System.out.println("NAME :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary:"+salary);
        System.out.println("Designation :"+desig);
    }
    @Override
    void raise() {
        salary = salary+20000;
	System.out.println("Raise :"+20000);
	System.out.println("Updated Salary:"+salary);
    }

	public void cab(){
	System.out.println("Cab Available");
	}

}

final class Manager extends Emp implements Cab
{
    String desig="Manager";
    int salary=55000;
    void display()
    {
        System.out.println("========================");
        System.out.println("ID :"+id);
        System.out.println("NAME :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary:"+salary);
        System.out.println("Designation :"+desig);
    }
    @Override
    void raise() {
        salary = salary+22000;
	System.out.println("Raise :"+22000);
	System.out.println("Updated Salary:"+salary);
    }

	public void cab(){
	System.out.println("Cab Available");
	}

}


class raiseSal
{
    public static void main(String args[])
    {
        int ch=0;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("\n1 ) Clerk ");
            System.out.println("2 ) Developer");
            System.out.println("3 ) Tester ");
            System.out.println("4 ) Manager");
            System.out.println("5 ) Exit\n");
            System.out.print("Enter the Chioice :");
            ch=sc.nextInt();
            if(ch==1)
            {
                Clerk c= new Clerk();
                c.display();
		c.raise();
		c.cab();
            }
            else if(ch==2)
            {
                Developer d = new Developer();
                d.display();
		d.raise();
		d.cab();
            }
            else if(ch==3)
            {
                Tester t = new Tester();
                t.display();
		t.raise();
		t.cab();
            }
            else if(ch==4)
            {
                Manager m = new Manager();
                m.display();
		m.raise();
		m.cab();
            }
            else if(ch==5)
            {
                System.out.println("Thank you");
                System.exit(0);
            }
            else{
                System.out.println("Invalid choice!");
            }

        }while(ch<=4);
    }

}