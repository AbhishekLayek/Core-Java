/*
 * finally: finally is a block in exception handling which will be excuted even though exception is not handled.
 */

package exception_handling.exception_handling_syntax;

public class TryFinally {
	public static void main(String[] args) {
		try {
			int a = 10/0;
			System.out.println(a);
		}
		finally {
			System.out.println("Finally Block Will Be Executed Always");
		}
	}
}

/*
 * Output:
 * 
 * Finally Block Will Be Executed Always
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Core_Java/exception_handling.exception_handling_syntax.TryFinally.main(TryFinally.java:10)
 */
