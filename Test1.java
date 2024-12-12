
public class Test1 {
//Simple In
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parent class (super class)
		class Animal {
			void eat() {
				System.out.println("I am eating");
			}
		}
		
		//child class 
	
		class Dog extends Animal {
			void bark() {
				System.out.println("i am barking");
			}
		}
		
		Dog d1=new Dog();
		d1.eat();//Inherit from parent class
		d1.bark();
		
	}

}
