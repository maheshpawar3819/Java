
public class MultilevelInheritance {
	
	static class A{
		void parent(){
			System.out.println("Class A");
		}
	}
	
	static class B extends A {
		void child1() {
			System.out.println("Class B");
		}
	}
	
	static class C extends B {
		void child2() {
			System.out.println("Class C");
		}
	}
	
  public static void main(String[] args) {
	  //parent class
	  A obj1=new A();
	  obj1.parent();
	  
	  System.out.println("----------------------------------");
	  
	  B obj2=new B();
	  obj2.parent();
	  obj2.child1();
	  
	  System.out.println("----------------------------------");
	  
	  C obj3=new C();
	  obj3.parent();
	  obj3.child1();
	  obj3.child2();
	  
  }
}
