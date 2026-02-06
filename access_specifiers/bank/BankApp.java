package access_specifiers.bank;

public class BankApp {
	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount();
		
		acc.accountHolderName = "Abhishek Layek";
		acc.accountNumber = 969840249876L;
		
		acc.deposit(10000);
		
		System.out.println("Bank Name: " + acc.bankName);
		System.out.println("Account Holder Name: " + acc.accountHolderName);
		System.out.println("Account Number: " + acc.accountNumber);
		
		System.out.println("Balance: " + acc.getBalance());
	}
}
