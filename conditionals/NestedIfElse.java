package conditionals;

import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("The Number Is Positive");
			if(num % 2 == 0) {
				System.out.println("The Number Is Even");
			}
			else {
				System.out.println("The Number Is Odd");
			}
		}
		else {
			System.out.println("The Number Is Negative");
		}
		
		sc.close();
	}
}
