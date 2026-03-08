/*
 * Explicit Locks: These locks are more advanced locks that will provide more control to lock and unlock using the Lock class which belongs to java.util.concurrent.locks pacakge.
 */

package thread.explicit_lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	private int balance = 10000;
	
	private final Lock lock = new ReentrantLock();
	
	public void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " Is Attempting To Withdraw " + amount);
		try {
			if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
				if(balance >= amount) {
					try {
						System.out.println(Thread.currentThread().getName() + " Processing Transaction...");
						Thread.sleep(3000);
						balance -= amount;
						System.out.println(Thread.currentThread().getName() + " Withdraw Complted. Available Balance: " + balance);
					}
					catch(InterruptedException e) {
						System.out.println("Transaction Failed!");
					}
					finally {
						lock.unlock();
					}
				}
				else {
					System.out.println(Thread.currentThread().getName() + " Insufficient Balance");
				}
			}
			else {
				System.out.println(Thread.currentThread().getName() + " Could Not Acquire The Lock, Will Try Later.");
			}
		}
		catch(Exception e) {
			Thread.currentThread().interrupt();
		}
	}
}
