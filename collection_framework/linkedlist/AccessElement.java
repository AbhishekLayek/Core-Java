package collection_framework.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class AccessElement {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(10,20,30,40,50));
		
		System.out.println(list.get(1)); // 20
		System.out.println(list.getFirst()); // 10
		System.out.println(list.getLast()); // 50
	}
}
