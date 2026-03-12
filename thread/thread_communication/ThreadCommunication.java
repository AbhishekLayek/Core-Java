/*
 * Thread Communication: In a multi-threaded environment threads often need to communicate and coordinate with each other to accomplish a task.
 */

package thread.thread_communication;

public class ThreadCommunication {
	public static void main(String[] args) {
		SharedResource resorce = new SharedResource();
		
		Thread produceThread = new Thread(new Producer(resorce));
		Thread consumeThread = new Thread(new Consumer(resorce));
		
		produceThread.start();
		consumeThread.start();
	}
}

/* 
 * Output:
 * 
 * Produced: 0
 * Consumed: 0
 * Produced: 1
 * Consumed: 1
 * Produced: 2
 * Consumed: 2
 * Produced: 3
 * Consumed: 3
 * Produced: 4
 * Consumed: 4
*/