/*
 * DelayQueue: DelayQueue class in java belongs to java.util.concurrent package that implements BlockingQueue interface.
 * 
 * In DelayQueue elements can only be taken when their delay has expired.
 */

package collection_framework.delayqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

public class DelayQueueDemo {
	public static void main(String[] args) throws InterruptedException {
		
		BlockingQueue<DelayedTask> delayQueue = new DelayQueue<>();
		
		delayQueue.put(new DelayedTask("Task1", 5, TimeUnit.SECONDS));
		delayQueue.put(new DelayedTask("Task2", 3, TimeUnit.SECONDS));
		delayQueue.put(new DelayedTask("Task3", 10, TimeUnit.SECONDS));
		
		while(!delayQueue.isEmpty()) {
			DelayedTask task = delayQueue.take();
			System.out.println("Executed: " + task.getTaskName() + " At " + System.currentTimeMillis());
		}
	}
}

/*
 * Output:
 * 
 * Executed: Task2 At 1771862975676
 * Executed: Task1 At 1771862977677
 * Executed: Task3 At 1771862982676
 */
