abstract class Laptop {
	abstract void companyName();
}

class Gaming extends Laptop {
	void companyName() {
		System.out.println("Hp");
	}
}

class Bussiness extends Laptop {
	void companyName() {
		System.out.println("Dell");
	}
}

class Student extends Laptop {
	void companyName() {
		System.out.println("Lenovo");
	}
}

public class Test2 {

	public static void main(String[] args) {
		Gaming g1=new Gaming();
		g1.companyName();

		Bussiness b1=new Bussiness();
		b1.companyName();
		
		Student s1=new Student();
		s1.companyName();
	}

}
