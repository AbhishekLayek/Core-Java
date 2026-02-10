package exception_handling.user_defined_exception;

public class Netflix{
	
	public void signUp(int age) throws NetflixException{
		if(age > 18) {
			System.out.println("You Are Eligible. SignUp Successfull!");
		}
		else {
			throw new NetflixException("Invalid Age!");
		}
	}
}
