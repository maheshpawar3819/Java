
public class CheckLeapYear {

	public static void main(String[] args) {
		// program to check leap year
		
		int year = 2012;
		if((year%4==0 && year%100 !=0) || (year%400==0)) {
			System.out.println("Given year is leap year");
		}else {
			System.out.println("Given year is not leap year");
		}

	}

}

