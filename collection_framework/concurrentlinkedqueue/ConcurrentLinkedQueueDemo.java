/*
 * ConcurrentLinkedQueue: ConcurrentLinkedQueue class in Java belongs to java.util.concurrent package that implements Queue interface.
 * 
 * It is a thread-safe, non-blocking queue designed for highly concurrent environments.
 */

package collection_framework.concurrentlinkedqueue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {
	public static void main(String[] args) {
		ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();
		
		Thread producer = new Thread(()->{
			while(true) {
				try {
					taskQueue.add("Task" + System.currentTimeMillis());
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread consumer = new Thread(()->{
			while(true) {
				try {
					String task = taskQueue.poll();
					System.out.println("Processing: " + task);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
		producer.start();
		consumer.start();
	}
}
