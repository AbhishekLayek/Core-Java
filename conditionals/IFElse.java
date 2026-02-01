package conditionals;

import java.util.Scanner;

public class IFElse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("You're Eligible For Vote");
		}
		else {
			System.out.println("You're Not Eligible For Vote");
		}
		sc.close();
	}
}
