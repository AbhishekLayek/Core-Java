/*
 * Deque: Deque interface in Java belongs to java.util package and it extends to Queue interface. It stands for double-ended queue that allows insertion, deletion and retrieval of elements form both ends.
 * 
 * ArrayDeque: ArrayDeque class in Java belongs to java.util package and it is a resizeable circular array implementation of Deque interface.  
 */

package collection_framework.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		deque.add(30);
		deque.addFirst(20);
		deque.offerFirst(10);
		deque.addLast(40);
		deque.offerLast(50);
		
		System.out.println(deque); // [10, 20, 30, 40, 50]
		
		System.out.println(deque.getFirst()); // 10
		System.out.println(deque.getLast()); // 50
		System.out.println(deque.peekFirst()); // 10
		System.out.println(deque.peekLast()); // 50
		System.out.println(deque.removeFirst()); // 10
		System.out.println(deque.pollLast()); // 50
		
		System.out.println(deque); // [20, 30, 40]
	}
}
