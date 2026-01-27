package operators;

public class ArithmeticOperator {
	public static void main(String[] args) {
		
		int a = 8;
		int b = 2;
		
		int add = a + b; // Addition
		System.out.printf("The Value Of %d + %d: %d\n", a,b,add);
		int sub = a - b; // Subtraction
		System.out.printf("The Value Of %d - %d: %d\n", a,b,sub);
		int mul = a * b; // Multiplication
		System.out.printf("The Value Of %d * %d: %d\n", a,b,mul);
		int div = a / b; // Division
		System.out.printf("The Value Of %d / %d: %d\n", a,b,div);
		int rem = a % b; // Modulus
		System.out.printf("The Value Of %d %% %d: %d\n", a,b,rem);
		
		// Precision Of Arithmetic Operator: *,/,% > +,-
		// Associty: Left To Right
		
		int res = 5 - 2 * 4 / 2 + 5 % 2;
		System.out.println(res);
		
	}
}
