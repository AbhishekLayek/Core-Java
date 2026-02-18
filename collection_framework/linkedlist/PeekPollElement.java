package collection_framework.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class PeekPollElement {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(10,20,30,40,50));
		
		System.out.println(list.peek()); // 10
		System.out.println("After Peek: " + list); // After Peek: [10, 20, 30, 40, 50]
		
		System.out.println(list.poll()); // 10
		System.out.println("After Poll: " + list); // After Poll: [20, 30, 40, 50]
	}
}
