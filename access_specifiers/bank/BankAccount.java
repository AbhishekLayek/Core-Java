package access_specifiers.bank;

public class BankAccount {
	
	public String bankName = "SBI"; // Public - Accessible Everywhere
	protected String accountHolderName; // Protected - Accessible within same package and subclasses
	long accountNumber; // Default - Accessible within same package
	private double balance; // Private - Accessible within this class
	
	public void deposit(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
}
