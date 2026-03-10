/*
 * ReentrantLock: ReentrantLock in Java specifies that a thread which already acquired a lock, can acuqire the same lock again without blocking.
 * 
 * Internal Working:
 * 
 * 1) The lock internally maintain a hold count.
 * 2) lock() call will increase the count by 1.
 * 3) unlock() call will decrease the count by 1.
 * 4) The lock will be released when count become 0.
 */

package thread.explicit_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
	private final Lock lock = new ReentrantLock();
	
	public void outerMethod() {
		lock.lock(); // Hold Count = 1
		try {
			System.out.println("Outer Method");
			innerMethod();
		}
		finally {
			lock.unlock(); // Hold Count = 0
		}
	}
	
	public void innerMethod() {
		lock.lock(); // Hold Count = 2
		try {
			System.out.println("Inner Method");
		}
		finally {
			lock.unlock(); // Hold Count = 1
		}
	}
	
	public static void main(String[] args) {
		ReentrantLockExample example = new ReentrantLockExample();
		
		example.outerMethod();
	}
}
