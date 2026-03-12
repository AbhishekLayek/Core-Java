/*
 * wait(): It will tell the current Thread to release the lock and to wait untill any other Thread calls notify() or notifyAll() method.
 * notify(): It will wakes up a single Thread that is waiting.
 * notifyAll(): It will wakes up all Thread that are waiting.
 */

package thread.thread_communication;

public class SharedResource {
	private int data;
	private boolean hasData;
	
	public synchronized void produce(int value) {
		while(hasData) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		data = value;
		hasData = true;
		System.out.println("Produced: " + value);
		notify();
	}
	
	public synchronized int consume() {
		while(!hasData) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		hasData = false;
		System.out.println("Consumed: " + data);
		notify();
		return data;
	}
}
