package conditionals;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("The Number Is Positive");
		}
		else if(num < 0) {
			System.out.println("The Number Is Negative");
		}
		else {
			System.out.println("The Number Is Zero");
		}
		
		sc.close();
	}
}
