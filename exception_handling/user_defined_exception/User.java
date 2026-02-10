package exception_handling.user_defined_exception;

public class User {
	public static void main(String[] args){
		
		Netflix account = new Netflix();
		
		try {
			account.signUp(17);
		}
		catch(NetflixException e) {
			System.out.println(e); // exception_handling.user_defined_exception.NetflixException: Invalid Age!
			System.out.println(e.getMessage()); // Invalid Age!
		}
	}
}
