class Emp{
	class Insert{
		Insert(){
			System.out.println("Insert class");
		}
		void abc(){
			System.out.println("ABC");
		}
	}

	class Display{
		Display(){
			System.out.println("Display class");
		}
		void xyz(){
			System.out.println("XYZ");
		}
	}
}
class InnClass{
	public static void main(String args[]){
		System.out.println("Main");
		Emp e = new Emp();
		Emp.Insert ins=e.new Insert();
		ins.abc();
		Emp.Display dis=e.new Display();
		dis.xyz();

	}
}