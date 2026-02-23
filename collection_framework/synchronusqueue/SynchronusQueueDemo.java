/*
 * BlockingQueue: BlockingQueue interface in Java belongs to java.util.concurrent package that extends Queue interface.
 * 				  It represents thread-safe queue that support operations that wait for the queue to become non-empty while retrieving an element and wait for space to become available while inserting an element. 
 * 
 * SynchronusQueue: SynchronusQueue class belongs to java.util.concurrent package and it implements BlockingQueue interface.
 * 
 * Key Features:
 * 
 * 1. Each insertion operation must wait for a corresponding remove operation by another thread or vice-versa.
 */

package collection_framework.synchronusqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronusQueueDemo {
	public static void main(String[] args) {
		
		BlockingQueue<String> queue = new SynchronousQueue<>();
		
		Thread producer = new Thread(()->{
			try {
				System.out.println("Producer Is Waiting To Transfer...");
				queue.put("Hello From Producer!");
				System.out.println("Producer Transfered The Message.");
			}
			catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("Producer Interrupted");
			}
		});
		
		Thread consumer = new Thread(()->{
			try {
				System.out.println("Consumer Is Waiting To Receive...");
				String message = queue.take();
				System.out.println("Consumer Received: " + message);
			}
			catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("Consumer Interrupted");
			}
		});
		
		producer.start();
		consumer.start();
	}
}

/*
 * Output: 
 * 
 * Producer Is Waiting To Transfer...
 * Consumer Is Waiting To Receive...
 * Producer Transfered The Message.
 * Consumer Received: Hello From Producer!
 */
