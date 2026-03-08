package thread.explicit_lock;

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
 * Thread 1 Is Attempting To Withdraw 1000
 * Thread 2 Is Attempting To Withdraw 1000
 * Thread 1 Processing Transaction...
 * Thread 2 Could Not Acquire The Lock, Will Try Later.
 * Thread 1 Withdraw Complted. Available Balance: 9000
 */
