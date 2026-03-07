/*
 * synchronized: synchronized keyword ensures that only one thread can access or modify at a time.
 */

package thread.synchronization;

public class Counter {
	private int count = 0;
	
	public synchronized void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}
