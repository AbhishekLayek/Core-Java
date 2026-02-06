package access_specifiers.customer;

import access_specifiers.bank.BankAccount;

public class CustomerApp extends BankAccount{
	
	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount();
		
		acc.deposit(10000);
		
		System.out.println("Bank Name: " + acc.bankName);
		
		// System.out.println("Account Holder Name: " + acc.accountHolderName); --> Error! because we are accessing with BankAccount reference not inheritance reference
		
		CustomerApp capp = new CustomerApp();
		System.out.println("Account Holder Name: " + capp.accountHolderName);
		
		// System.out.println("Account Number: " + acc.accountNumber); --> Error! because private attribute
		
		
		System.out.println("Balance: " + acc.getBalance());
	}
}
