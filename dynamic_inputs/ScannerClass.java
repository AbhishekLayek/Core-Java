package dynamic_inputs;

import java.util.Scanner;

/*
 * Scanner Class: In Java, the Scanner class is present in the java.util package is used to obtain input for primitive types like int, double, etc., and strings. We can use this class to read input from a user or a file.
 */

public class ScannerClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Integer Value: ");
		int n = sc.nextInt();
		
		System.out.print("Enter The Long Value: ");
		long l = sc.nextLong();
		
		System.out.print("Enter The Float Value: ");
		float f = sc.nextFloat();
		
		System.out.print("Enter The Double Value: ");
		Double d = sc.nextDouble();
		
		System.out.print("Enter The String Value: ");
		String str = sc.next();
		
		System.out.println(n);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(str);
		
		sc.close();
	}
}
