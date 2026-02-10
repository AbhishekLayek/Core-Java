/*
 * throw: throw keyword is used to explicitly throw exception.
 */

package exception_handling.exception_handling_syntax;

public class Throw {
	
	public static void checkValidAge(int age) {
		if(age < 18) {
			throw new IllegalArgumentException("Age Is Not Valid");
		}
		System.out.println("Age Is Valid");
	}
	
	public static void main(String[] args) {
		checkValidAge(17);
	}
}
