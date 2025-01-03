class Test{
	int i;
	void setver(int i) {
		//this keyword refers to current instance varible or object
		this.i=i;
	}
	
	void print() {
		System.out.println(i);
	}
}


public class ThisKey {
   public static void main(String [] args) {
	   Test t=new Test();
	   t.setver(50);
	   t.setver(100);
	   t.print();
   }
}
