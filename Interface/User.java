package Interface;

public class User {
	public static void main(String[] args) {
		
		ImplementationClass impl = new ImplementationClass();
		
		System.out.println("Bank Name: " + Interface.bankName);
		
		impl.UserName();
		impl.Password();
	}
}
