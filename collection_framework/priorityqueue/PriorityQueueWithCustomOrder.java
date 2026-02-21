package collection_framework.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueWithCustomOrder {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		pq.add(15);
		pq.add(10);
		pq.offer(30);
		pq.offer(5);
		
		System.out.println(pq); // [30, 10, 15, 5]
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		/*
		 * Output:
		 * 30
		 * 15
		 * 10
		 * 5
		 */
	}
}
