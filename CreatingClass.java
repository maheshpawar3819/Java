public class CreatingClass {
	public static void main(String [] args) {
		System.out.println("Main method");
		
		//create instance of animal class
		Animal moti= new Animal();
		
		Car harrier= new Car();
		
		Operations sum =new Operations();
		
		moti.eat();
		moti.run();
		
		harrier.drive();
		harrier.stay();
		
		int result=sum.addition(10, 20);
		System.out.println("The addition is "+ result);
	}
	
}
	
	class Animal {
		//creating method
		public void eat() {
			System.out.println("Eating");
		}
		
		public void run() {
			System.out.println("Running Dog");
		}
	}
	
	class Car {
		public void drive() {
			System.out.println("Running");
		}
		
		public void stay () {
			System.out.println("Car Stay");
		}
	}
	
	class Operations {
		public int addition (int a , int b) {
			return a+b;
		}
	}
	
	

