package exception_handling.runtime_exception;

public class StringIndexOutOfBounds_Exception {
	public static void main(String[] args) {
		
		String str = "JAVA";
		
		try {
			System.out.println(str.charAt(4));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e); // java.lang.StringIndexOutOfBoundsException: Index 4 out of bounds for length 4
			System.out.println("Exception Is Handled");
		}
	}
}
