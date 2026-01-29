// Jagged Array: A Jagged Array is a multi-dimensional array, where each row have different number of columns.

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Jagged Array Declaration:
		 * 
		 * Syntax:
		 * 		datatype[][] array_name = new datatype[n][]; // n = number of rows
		 * 		array_name[0] = new datatype[n1]; // n1 = number of columns in row 0
		 * 		array_name[1] = new datatype[n2]; // n2 = number of columns in row 1
		 * 		array_name[2] = new datatype[n3]; // n3 = number of columns in row 2
		*/
		
		int[][] jagged_arr = new int[3][];
		jagged_arr[0] = new int[2];
		jagged_arr[1] = new int[3];
		jagged_arr[2] = new int[4];
		
		// Jagged Array Initialization
		
		System.out.println("Enter Array Elements: ");
		
		for(int row = 0; row < jagged_arr.length; row++) {
			for(int column = 0; column < jagged_arr[row].length; column++) {
				jagged_arr[row][column] = sc.nextInt();
			}
		}
		
		System.out.println("Jagged Array: " + Arrays.deepToString(jagged_arr));
		
		// Jagged Array Declaration & Initialization 
		
		int[][] jagged_arr2 = {{10,20},{30,40,50},{60,70,80,90}};
		
		System.out.println(Arrays.deepToString(jagged_arr2));
		
		sc.close();
	}
}
