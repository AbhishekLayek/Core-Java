package exception_handling.runtime_exception;

public class NullPointer_Exception {
	public static void main(String[] args) {
		
		NullPointer_Exception n = null;
		
		try {
			System.out.println(n.toString());
		}
		catch(NullPointerException e) {
			System.out.println(e); // java.lang.NullPointerException: Cannot invoke "Object.toString()" because "n" is null
			System.out.println("Exception Is Handled");
		}
	}
}
