import java.util.Arrays;

public class twodimantinalarray {

	public static void main(String[] args) {
		//Two Dimensional Array
		//Regular Array
		int arr[][]=new int[2][4];
		//1st
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[0][3]=40;
//		2nd
		arr[1][0]=15;
		arr[1][1]=20;
		arr[1][2]=25;
		arr[1][3]=30;
		
		System.out.println(Arrays.deepToString(arr));
		
		//Two Dimensional Gagged Array
		//Gagged Array
		int arr2[][]=new int [2][];
		
		arr2[0]=new int[4];
		arr2[1]=new int[2];
//		1st
		arr2[0][0]=5;
		arr2[0][1]=10;
		arr2[0][2]=15;
		arr2[0][3]=20;
		
//		2nd
		arr2[1][0]=25;
		arr2[1][1]=30;
		
		System.out.println(Arrays.deepToString(arr2));
		
	}
	

}
