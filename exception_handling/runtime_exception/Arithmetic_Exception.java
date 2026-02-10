package exception_handling.runtime_exception;

public class Arithmetic_Exception {
	public static void main(String[] args) {
		try {
			int div = 10/0;
			System.out.println(div);
		}
		catch(ArithmeticException e) {
			System.out.println(e); // java.lang.ArithmeticException: / by zero
			System.out.println("Exception Is Handled");
		}
	}
}
