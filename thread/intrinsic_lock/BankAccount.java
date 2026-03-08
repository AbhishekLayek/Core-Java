/*
 * Intrinsic Lock: This locks are inbuilt locks present in every objects in Java. We can't see but it'll be present. When we use synchronized keyword, basically we are using these automatic locks.
 */

package thread.intrinsic_lock;

public class BankAccount {
	private int balance = 10000;
	
	public synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " Is Attempthing To Withdraw " + amount);
		
		if(balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " Processing Transaction...");
			try {
				Thread.sleep(10000);
			}
			catch(InterruptedException e) {
				System.out.println("Transaction Failed!");
			}
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " Withdraw Completed. Available Balance: " + balance);
		}
		else {
			System.out.println(Thread.currentThread().getName() + " Insufficient Balance");
		}
	}
}
