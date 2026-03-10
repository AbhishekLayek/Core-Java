/*
 * ReadWriteLock: ReadWriteLock interface in Java allows multiple threads to read concurrently but only one thread can write at a time.
 */

package thread.readwritelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
	private int count = 0;
	
	private final ReadWriteLock lock = new ReentrantReadWriteLock();
	private final Lock readLock = lock.readLock();
	private final Lock writeLock = lock.writeLock();
	
	public void increment() {
		writeLock.lock();
		try {
			count++;
		}
		finally {
			writeLock.unlock();
		}
	}
	
	public int getCount() {
		readLock.lock();
		try {
			return count;
		}
		finally {
			readLock.unlock();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ReadWriteLockExample example = new ReadWriteLockExample();
		
		Runnable readTask = new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() + " Read: " + example.getCount());
				}
			}
		};
		
		Runnable writeTask = new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					example.increment();
					System.out.println(Thread.currentThread().getName() + " Incremented");
				}
			}
		};
		
		Thread writerThread = new Thread(writeTask, "WriterThread");
		Thread readerThread1 = new Thread(readTask, "ReaderThread 1");
		Thread readerThread2 = new Thread(readTask, "ReaderThread 2");
		
		writerThread.start();
		readerThread1.start();
		readerThread2.start();
		
		writerThread.join();
		readerThread1.join();
		readerThread2.join();
	}
}

/*
 * Output:
 * 
 * WriterThread Incremented
 * WriterThread Incremented
 * WriterThread Incremented
 * WriterThread Incremented
 * WriterThread Incremented
 * ReaderThread 1 Read: 0
 * ReaderThread 1 Read: 5
 * ReaderThread 1 Read: 5
 * ReaderThread 1 Read: 5
 * ReaderThread 1 Read: 5
 * ReaderThread 2 Read: 0
 * ReaderThread 2 Read: 5
 * ReaderThread 2 Read: 5
 * ReaderThread 2 Read: 5
 * ReaderThread 2 Read: 5
 */
