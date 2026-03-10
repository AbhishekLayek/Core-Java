/*
 * FairLock: A Fair Lock grants access to the thread that has been waiting the longest.
 */

package thread.fairness_of_locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLockExample {
	private final Lock fairLock = new ReentrantLock(true); // Here true indicating fairness of lock.
	
	public void accessResource() {
		fairLock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + " acquired the lock");
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		finally {
			System.out.println(Thread.currentThread().getName() + " released the lock");
			fairLock.unlock();
		}
	}
	
	public static void main(String[] args) {
		FairLockExample example = new FairLockExample();
		
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				example.accessResource();
			}
		};
		
		Thread t1 = new Thread(task, "Thread 1");
		Thread t2 = new Thread(task, "Thread 2");
		Thread t3 = new Thread(task, "Thread 3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}

/*
 * Possible Output 1:
 * 
 * Thread 1 acquired the lock
 * Thread 1 released the lock
 * Thread 2 acquired the lock
 * Thread 2 released the lock
 * Thread 3 acquired the lock
 * Thread 3 released the lock
 */
