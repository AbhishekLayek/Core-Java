/*
 * BlockingQueue: BlockingQueue interface in Java belongs to java.util.concurrent package that extends Queue interface.
 * 				  It represents thread-safe queue that support operations that wait for the queue to become non-empty while retrieving an element and wait for space to become available while inserting an element. 
 * 
 * PriorityBlockingQueue: PriorityBlockingQueue class belongs to java.util.concurrent package and it implements BlockingQueue interface.
 * 
 * Key Features:
 * 
 * 1. It is unbounded.
 * 2. Head element ordered based on natural ordering.
 * 3. put method won't block.
 */

package collection_framework.priorityblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {
	public static void main(String[] args) {
		
		BlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
		
		queue.add(15);
		queue.add(10);
		queue.offer(20);
		queue.offer(5);
		
		
		System.out.println(queue); // [5, 10, 20, 15]
		
		for(Integer item: queue) {
			System.out.println(item);
		}
		
		System.out.println(queue.peek()); // 5
		System.out.println(queue.poll()); // 5
		
		System.out.println(queue); // [10, 15, 20]
	}
}
