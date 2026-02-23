package collection_framework.priorityblockingqueue;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueWithCustomOrder {
	public static void main(String[] args) {
		
		BlockingQueue<Integer> queue = new PriorityBlockingQueue<>(10, Comparator.reverseOrder());
		
		queue.add(15);
		queue.add(10);
		queue.offer(20);
		queue.offer(5);
		
		
		System.out.println(queue); // [20, 10, 15, 5]
		
		for(Integer item: queue) {
			System.out.println(item);
		}
	}
}
