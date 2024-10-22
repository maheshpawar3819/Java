import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
	
		//Arrays
		int arr []=new int[3];
		//shore values in the array
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		//methods of printing arrays
//		1.with using for loop
//		2.with using for each loop
//		2.with using arrays method
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
//		for(int x:arr) {
//			System.out.println(x);
//		}
		
		System.out.println(Arrays.toString(arr));
		
		int numbers []= {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numbers));
	}

}
