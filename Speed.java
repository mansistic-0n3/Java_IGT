//final method cannot be overridden
//can't modify final variable
//can't inherit final class

final class Bike{
	final int speed = 100;
	final void run(){
		System.out.println("BIKE Running with speed 100...");
	}
}
class Car{
	final int speed = 200;
	final void run(){
		System.out.println("CAR Running with speed 200...");
	}
}

class Maruti extends Car{
	// void run(){
	//	System.out.println("MARUTI CAR Running with speed 200...");
	//}
}

//class Honda extends Bike{
//	void run(){
//		System.out.println("Running with speed 100...");
//	}
//}

class Speed{
	public static void main(String args[]){
		Car a = new Car();
		a.run();
		System.out.println("CAR Speed : "+a.speed);
		//c.speed = 5000;
		Maruti m = new Maruti();
		m.run();

		Bike b = new Bike();
		b.run();
		System.out.println("BIKE Speed : "+b.speed);
		//c.speed = 5000;
		//Honda h = new Honda();
		//h.run();
	}
}