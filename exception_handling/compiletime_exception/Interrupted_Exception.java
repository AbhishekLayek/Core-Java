package exception_handling.compiletime_exception;

public class Interrupted_Exception {
	public static void main(String[] args) {
		try {
			for(int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Exception Is Handled");
		}
	}
}
