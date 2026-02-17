package collection_framework.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveElement {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(10,20,30,40,50));
		
		list.remove(1);
		System.out.println(list); // [10, 30, 40, 50]
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list); // [30, 40]
	}
}
