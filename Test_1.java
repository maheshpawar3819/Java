interface Test {
	// in interface all methods are by default abstract
	public void show();
}

interface Test2{
	public void interface2();
}

//Note : with using multiple interfaces we can easily achieve multiple inheritance 

class Demo implements Test,Test2{
	
	//method overriding is happen
	public void show() {
		System.out.println("1 : this method comes from interface 1");
	}
	
	//Implement interface 2
	public void interface2() {
		System.out.println("2 : this method comes from interface 2");
	}
	
	void display() {
		System.out.println("3 :concrit method of Demo class");
	}
}


public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we cannot create object of interface Java don't allows to do that
//		Test t1=new Test();
		
		Demo d1=new Demo();
		d1.show();
		d1.interface2();
		d1.display();

	}

}
