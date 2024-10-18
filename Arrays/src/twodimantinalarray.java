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
	}
	

}
