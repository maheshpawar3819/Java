
public class Initialize {
	//initialize value to object by using referance variable
	int age;
	String name;
	
	public static void main (String [] args) {
		Initialize student=new Initialize();
		
		student.age=20;
		student.name="Mahesh";
		
		System.out.println(student.age+" "+student.name);

	}
}
