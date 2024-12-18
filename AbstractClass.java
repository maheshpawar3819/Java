abstract class Vehicle{
	abstract void start();
}

class Car extends Vehicle{
	//you must execute body of abstract class method
	void start() {
		System.out.println("Start with key");
	}
	
}

class Bike extends Vehicle{
	//you must execute body of abstract class method
	void start() {
		System.out.println("Start with kick");
	}
}

class HeavyVehicle extends Vehicle {
	//you must execute body of abstract class method
	void start () {
		System.out.println("Start with button");
	}
}

public class AbstractClass {
		public static void main(String[] args) {
			//you cannot create the object of abstract class
//			Vehicle v1=new Vehicle();
//			v1.start();
			
			Car c1=new Car();
			c1.start();
			
			Bike b1=new Bike();
			b1.start();
			
			HeavyVehicle h1=new HeavyVehicle();
			h1.start();
		}
}
