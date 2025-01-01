class Car {
	private String name;
	private int price;
	private String company;
	
	//setter method
	public void setData(String nm,int pr,String cm) {
		name=nm;
		price=pr;
		company=cm;
	}
	
	public String  getData() {
		return "Name " + name +  "Price " + price +  "Company " + company; 
	}
}


public class Test2 {

	public static void main(String[] args) {
		Car c=new Car();
		c.setData("Curv", 1200000, "Tata");
		System.out.println(c.getData());

	}

}
