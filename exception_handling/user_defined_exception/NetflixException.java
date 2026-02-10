package exception_handling.user_defined_exception;

public class NetflixException extends Exception{
	
	private final String message;
	
	public NetflixException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
