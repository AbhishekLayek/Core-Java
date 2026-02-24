/*
 * ConcurrentLinkedDeque: ConcurrentLinkedDeque class in Java belongs to java.util.concurrent package that implements Deque interface.
 * 
 * It is thred-safe, non-blocking double ended queue designed for concurrent environments
 */

package collection_framework.concurrentlinkeddeque;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {
	public static void main(String[] args) {
		
		ConcurrentLinkedDeque<String> taskQueue = new ConcurrentLinkedDeque<>();
		
		Thread producer = new Thread(()->{
			while(true) {
				try {
					taskQueue.push("Task" + System.currentTimeMillis());
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread consumer = new Thread(()->{
			while(true) {
				try {
					String task = taskQueue.peek();
					System.out.println("Processing: " + task);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		producer.start();
		consumer.start();
	}
}
