/*
 * Problem with Intrinsic Lock:
 * 
 * It'll lock the thread untill it finishes it's work. It'll be problematic when the wait is long as the other threads need to wait for long period.
 */

package thread.intrinsic_lock;

public class User {
	public static void main(String[] args) {
		BankAccount HDFC = new BankAccount();
		
		Runnable task = new Runnable() {
			@Override
			public void run() {
				HDFC.withdraw(1000);
			}
		};
		
		Thread t1 = new Thread(task, "Thread 1");
		Thread t2 = new Thread(task, "Thread 2");
		
		t1.start();
		t2.start();
	}
}

/*
 * Output:
 * 
 * Thread 1 Is Attempthing To Withdraw 1000
 * Thread 1 Processing Transaction...
 * Thread 1 Withdraw Completed. Available Balance: 9000
 * Thread 2 Is Attempthing To Withdraw 1000
 * Thread 2 Processing Transaction...
 * Thread 2 Withdraw Completed. Available Balance: 8000
 */
