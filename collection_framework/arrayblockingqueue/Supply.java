/*
 * BlockingQueue: BlockingQueue interface in Java belongs to java.util.concurrent package that extends Queue interface.
 * 				  It represents thread-safe queue that support operations that wait for the queue to become non-empty while retrieving an element and wait for space to become available while inserting an element. 
 * 
 * ArrayBlockingQueue: ArrayBlockingQueue class belongs to java.util.concurrent package and it is a fixed-size circular array implementation for BlockingQueue interface. 
 */

package collection_framework.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Supply {
	public static void main(String[] args) {
		
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
		
		Thread producer = new Thread(new Producer(queue));
		Thread consumer = new Thread(new Consumer(queue));
		
		producer.start();
		consumer.start();
	}
}
