// Calling Method: Calling one method inside another method body.

package methods;

public class CallingMethod {
	
	static void sub() {
		System.out.println("Inside Sub Method");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Methd Start");
		sub();
		System.out.println("Main Method End");
	}
}
