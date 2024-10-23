import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		//to types of creating string in java
//		1.
		String name=new String("Mahesh");
		System.out.println(name);
		
//		2.Direct leteral
		String lastName="Pawar";
		System.out.println(lastName);
	
//		Method 1 : Concat 
		String fullName=name.concat(lastName);
		System.out.println(fullName);
		
//		Method 2 : charAt
		System.out.println(fullName.charAt(4));
		
//		Method 3 : subString
		System.out.println(fullName.substring(2));
		System.out.println(fullName.substring(0,3));
		
//		Method 4 : length 
		System.out.println(fullName.length());
		
//		Method 5 : replace
		System.out.println(fullName.replace("P", "K"));
		
//		Method 6 : toUpperCase(),toLowerCase()
		System.out.println(fullName.toLowerCase());
		System.out.println(fullName.toUpperCase());
		
//		Method 7 : trim
		String carName="    RangeRover  ";
		System.out.println(carName.trim());
		
//		Method 8 : indexOf (It returns the index of 1st occurance of the specified character if the specified)
		System.out.println(carName.indexOf('R'));
		
//		Method 9 : lastIndexOf (It returns the index of last occurance of the specified character if the specified character is not available then it returns -1.)
		System.out.println(carName.lastIndexOf('r'));
		
//		Method 10 : split
		String [] arr=carName.split("");
		System.out.println(Arrays.toString(arr));
		
		//toCharArray
		char [] d=carName.toCharArray();
		System.out.println(Arrays.toString(d));
	}
	
		
	
}
