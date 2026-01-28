/* Method with Parameter: Calling or Invoking method by passing some parameter.
 * Actual Parameter/Argument: The values, which we pass while calling the method.
 * Formal Parameter/Argument: The variables declared at method declaration.
 */

package methods;

import java.util.Scanner;

public class MethodWithParameter {
	
	static void add(int num1, int num2) {
		System.out.printf("Sum of %d and %d Is: %d",num1,num2,(num1+num2));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = sc.nextInt();
		
		add(num1, num2);
		
		sc.close();
	}
}
