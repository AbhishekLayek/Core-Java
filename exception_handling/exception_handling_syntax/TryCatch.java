/*
 * try: Inside try block we should develop the exception.
 * catch: Inside catch block we should handle the exception.
 * 
 * Note: Whenever we develop any exception, internally JVM will throw respective exception class object, 
 * In order to overcome the exception we need to store that exception object inside reference variable of
 * respective exception classtype or supermost exception classtype or throwable classtype.
 */

package exception_handling.exception_handling_syntax;

public class TryCatch {
	public static void main(String[] args) {
		try {
			int div = 10/0;
			System.out.println(div);
		}
		catch(ArithmeticException e){
			System.out.println(e); // java.lang.ArithmeticException: / by zero
		}
	}
}
