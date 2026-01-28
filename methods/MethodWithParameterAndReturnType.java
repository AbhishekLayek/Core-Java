package methods;

import java.util.Scanner;

public class MethodWithParameterAndReturnType {
	
	static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = sc.nextInt();
		
		int res = add(num1, num2);
		
		System.out.printf("Sum of %d and %d Is: %d ",num1,num2,res);
		
		sc.close();
	}
}
