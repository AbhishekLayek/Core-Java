/*
 * BlockingQueue: BlockingQueue interface in Java belongs to java.util.concurrent package that extends Queue interface.
 * 				  It represents thread-safe queue that support operations that wait for the queue to become non-empty while retrieving an element and wait for space to become available while inserting an element. 
 * 
 * LinkedBlockingQueue: LinkedBlockingQueue class belongs to java.util.concurrent package and it implements BlockingQueue interface.
 * 
 * Key Features:
 * 
 * 1. It is optionally bounded.
 * 2. It uses two separate locks for enqueue and dequeue operation.
 * 3. Higher concurrency between producer and consumer.
 */

package collection_framework.linkedblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Supply {
	public static void main(String[] args) {
		
		BlockingQueue<Integer> queue = new LinkedBlockingDeque<>(10);
		
		Thread producer1 = new Thread(new Producer(queue));
		Thread producer2 = new Thread(new Producer(queue));
		Thread consumer1 = new Thread(new Consumer(queue));
		Thread consumer2 = new Thread(new Consumer(queue));
		
		producer1.start();
		producer2.start();
		consumer1.start();
		consumer2.start();
	}
}
