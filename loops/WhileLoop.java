package loops;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		int age = sc.nextInt();
		
		while(age <= 0 || age > 100) {
			System.out.print("Enter Valid Age: ");
			age = sc.nextInt();
			if(age > 0 && age < 100) {
				System.out.println("Valid");
			}
		}
		sc.close();
	}
}
