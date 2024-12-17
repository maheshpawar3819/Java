class Test1{
	void show() {
		System.out.println("Class Test : 1");
	}
}

class Test2 extends Test1{
	void show() {
		System.out.println("Class Test : 2");
	}
}


public class MethodOverriding {

	public static void main (String[] args) {
		Test2 t=new Test2();
		t.show();
		
		Test1 t1=new Test1();
		t1.show();
	}
}
