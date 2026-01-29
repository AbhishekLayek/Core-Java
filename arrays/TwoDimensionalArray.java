package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 2D Array Declaration(Syntax: datatype[][] array_name = new datatype[row_size][column_size];)
		int[][] arr = new int[2][2];
		
		// 2D Array (Syntax: array_name[row_index][colum_index] = value;)
		System.out.println("Enter Array Elements: ");
		for(int row = 0; row < arr.length; row++) {
			for(int column = 0; column < arr[row].length; column++) {
				arr[row][column] = sc.nextInt();
			}
		}
		
		System.out.println("Array arr: " + Arrays.deepToString(arr));
		
		// 2D Array Declaration & Initialization In Same Line
		int[][] brr = {{10,20,30},{40,50,60}};
		
		System.out.println("Array brr: " + Arrays.deepToString(brr));
		
		sc.close();
	}
}
