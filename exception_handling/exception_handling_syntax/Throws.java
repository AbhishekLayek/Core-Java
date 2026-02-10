/*
 * throws: throws keyword is used in method signature, used to indicate that the method might throw one of the listed exception
 */

package exception_handling.exception_handling_syntax;

public class Throws {
	public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException{
		int res = 10/0;
		System.out.println(res);
		
		int[] arr = {10, 20, 30};
		System.out.println(arr[3]);
	}
}
