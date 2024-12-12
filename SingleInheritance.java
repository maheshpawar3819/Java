
public class SingleInheritance {
	
	static class A {
		void parent() {
			System.out.println("A class method");
		}
	}
	
	static class B extends A {
		void child() {
			System.out.println("B class method");
		}
	}
	
	
	public static void main(String[] args) {
		B obj1=new B();
		obj1.parent();
		obj1.child();

		A obj2=new A();
		obj2.parent();
	}

}
