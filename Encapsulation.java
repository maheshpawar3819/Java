class Employee {
	private int salary;
	
	//use setter method
	public void setSalary(int slry) {
		salary=slry;
	}
	
	//use getter method
	public int getSalary() {
		return salary;
	}
}


public class Encapsulation {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setSalary(3000);
		System.out.println(e.getSalary());
	}

}
