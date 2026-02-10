/*
 * Note: If we write superclass inside first catch block and subclass inside second catch block we'll get complietime error, because exception will be already caught by the first catch block.
 * 
 * Correct way: Inside first catch block need to write subclass, second catch block we can write superclass.
 */

package exception_handling.exception_handling_syntax;

public class TryWithMultipleCatch {
	public static void main(String[] args) {
		try {
			int div = 10/0;
			System.out.println(div);
		}
		catch(ArithmeticException e){
			System.out.println(e); // java.lang.ArithmeticException: / by zero
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
