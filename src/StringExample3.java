
public class StringExample3 {
	public static void main(String[] args) {
		//example of concat string
		String name1=new String("Mahesh");
		String name2=new String("Dhanaji");
		
		String name3="Pawar";
		
		String join=name1.concat(" MERN Stack developer");
		System.out.println(join);
		
//		concat strings 
		System.out.println(name1 + " "+name2 +" "+ name3 +" " + join);
	}
}
