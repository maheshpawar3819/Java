
public class StringExample2 {

	public static void main(String[] args) {
		String s1=new String("Dhoni");
		String s2=new String("Dhoni");
		
//		Direct literal
		String s3="Dhoni";
		String s4="Dhoni";
		
		System.out.println(s1 == s2);
		System.out.println(s3==s4);//True :Because of this 2 variable referes same object 
	}

}
