package collection_framework.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class AddElements {
	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<>();
		
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		System.out.println(list1); // [20, 30, 40]
		
		list1.addFirst(10);
		list1.addLast(50);
		
		System.out.println(list1); // [10, 20, 30, 40, 50]
		
		LinkedList<Integer> list2 = new LinkedList<>();
		
		list2.add(60);
		list2.add(70);
		list2.add(80);
		
		list1.addAll(list2);
		
		System.out.println(list1); // [10, 20, 30, 40, 50, 60, 70, 80]
		
		LinkedList<Integer> list3 = new LinkedList<>(Arrays.asList(10,20,30,40,50));
		
		list2.addAll(0,list3);
		
		System.out.println(list2); // [10, 20, 30, 40, 50, 60, 70, 80]
	}
}
