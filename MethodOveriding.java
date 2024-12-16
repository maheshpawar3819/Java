//Program of method overriding

class ArgsChange {
	void num(int a,String b) {
		System.out.println("A");
	}
	
	void num(String b,int a) {
		System.out.println("B");
	}
}

class TypeOfArgument {
	void type(int a) {
		System.out.println("Type A");
	}
	
	void type(String a) {
		System.out.println("Type B");
	}
}

public class MethodOveriding {
	
	void show() {
		System.out.println("Hii Mahesh");

	};
	
	void show(int a) {
		System.out.println("Pawar");
	};

	public static void main(String[] args) {
		
		MethodOveriding m1=new MethodOveriding();
		m1.show(10);
		
		//method overriding with changing args
		ArgsChange a1=new ArgsChange();
		a1.num(10,"mahi");
		a1.num("Mahi", 10);
		
		//method overriding with changing type of argument
		TypeOfArgument t1=new TypeOfArgument();
		t1.type("mahi");
		t1.type(50);

	}

}
