package exception_handling.exception_handling_syntax;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			int div = 10/0;
			System.out.println(div);
		}
		catch(ArithmeticException e){
			System.out.println(e); // java.lang.ArithmeticException: / by zero
		}
		finally {
			System.out.println("Finally Block Will Be Executed Always");
		}
	}
}

/*
 * Output:
 * 
 * java.lang.ArithmeticException: / by zero
 * Finally Block Will Be Executed Always
 */
