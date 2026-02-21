/*
 * PriorityQueue: PriorityQueue class belongs to java.util package and implements Queue interface. In PriorityQueue elements
 * 				  are ordered based on their priority rather than order of insertion.
 */

package collection_framework.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(15);
		pq.add(10);
		pq.offer(30);
		pq.offer(5);
		
		System.out.println(pq); // [5, 10, 30, 15]
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		/*
		 * Output:
		 * 5
		 * 10
		 * 15
		 * 30
		 */
	}
}
