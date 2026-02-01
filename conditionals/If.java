package conditionals;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("You're Eligible For Vote");
		}
		sc.close();
	}
}
