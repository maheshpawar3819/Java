import java.util.Arrays;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		
		int [][] matrix= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12,13}
		};

		//print 2d array using for loop
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.println(matrix[i][j]+ "");
			}
			System.out.println(); //move to next line after each row
		}
		//using arrays method
		System.out.println("Print with using Arrays Method"+Arrays.deepToString(matrix));
	}
}
