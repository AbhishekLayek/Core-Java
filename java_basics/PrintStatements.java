package java_basics;

public class PrintStatements {
	public static void main(String[] args) {
		
		System.out.print("Hello"); // print(): It will print the output and keep the cursor on same line.
		System.out.println(" Everyone"); // println(): It will print the output and keep the cursor one next line.
		
		int a = 10;
		int b = 20;
		int sum = a + b;
		
		System.out.printf("The Value Of %d + %d = %d", a,b,sum); // printf(): It will print formated output.
	}
}
