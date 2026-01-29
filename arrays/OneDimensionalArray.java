package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Array Declaration(Syntax: datatype[] array_name = new datatype[size];)
		int[] arr = new int[5];
		
		// Array Initialization(Syntax: array_name[index] = value;)
		System.out.println("Enter The Elements: ");
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The Array arr Is: " + Arrays.toString(arr));
		
		// Array Declaration and Initialization In Same Line(Syntax: datatype[] array_name = {list of vales})
		int[] brr = {10,20,30,40,50};
		
		System.out.println("The Array brr Is: " + Arrays.toString(brr));
		
		sc.close();
	}
}
