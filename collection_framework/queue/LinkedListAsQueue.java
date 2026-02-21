package collection_framework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		/*
		 * Adding an Element:
		 * 
		 * add(E e): Used to add an element in queue. Return true if element added successfully. Throws exception if queue capacity is full.
		 * offer(E e): Used to add an element in queue.Return true if element added successfully. Return false if capacity is full.
		 */
		
		queue.add(1);
		queue.offer(2);
		
		/*
		 * Removing an Element:
		 * 
		 * remove(E e): Used to remove and return head element from queue. Throws exception if queue is empty.
		 * poll(): Used to remove and return head element from queue. Return null if queue is empty.
		 */
		
		System.out.println(queue.remove()); // 1
		System.out.println(queue.remove()); // 2
		System.out.println(queue.poll()); // null
		
		/*
		 * Accessing Head Element:
		 * 
		 * element(): It is used to retrieve head element from queue. Throws exception if queue is empty.
		 * peek(): It is used to retrieve head element from queue. Return null if queue is empty.
		 */
		
		System.out.println(queue.peek()); // null
		System.out.println(queue.element()); // Exception in thread "main" java.util.NoSuchElementException
	}
}
