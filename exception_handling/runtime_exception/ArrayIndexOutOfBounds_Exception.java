package exception_handling.runtime_exception;

public class ArrayIndexOutOfBounds_Exception {
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30};
		
		try {
			System.out.println(arr[3]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e); // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
			System.out.println("Exception Is Handled");
		}
	}
}
