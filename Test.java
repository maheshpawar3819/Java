
public class Test {
	
	String name;
	int id;
	
	Test(String name,int id){
		this.name=name;
		this.id=id;
		System.out.println("Paramaterized Constructor is called");
	}
	
	public static void main(String[] args) {
		// Constructor : Constructor is used to initialize the objetct
	
		Test t1=new Test("Mahesh",101);
		Test t2=new Test("Sanket",102);
		Test t3=new Test("Sneha",103);
		
		System.out.println("Student1 "+t1.name+" "+t1.id);
		System.out.println("Student1 "+t2.name+" "+t2.id);
		System.out.println("Student1 "+t3.name+" "+t3.id);
	}
	

}
