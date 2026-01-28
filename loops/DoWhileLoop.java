package loops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		do {
			System.out.print("Enter Your Age: ");
			age = sc.nextInt();
			if(age > 0 && age < 100) {
				System.out.println("Valid");
			}
		}
		while(age <= 0 || age > 100);
		
		sc.close();
	}
}
