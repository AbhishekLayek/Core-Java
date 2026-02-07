package encapsulation;

public class User {
	public static void main(String[] args) {
		Facebook f = new Facebook("Abhi", "Abhi@2001");
		
		System.out.println("Initial Username: " + f.getUsername());
		System.out.println("Initial Passord: " + f.getPassword());
		
		f.setUsername("Abhishek");
		f.setPassword("Abhi@1519");
		
		System.out.println("New Username: " + f.getUsername());
		System.out.println("New Passord: " + f.getPassword());
	}
}
