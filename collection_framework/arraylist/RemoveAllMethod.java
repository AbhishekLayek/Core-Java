package collection_framework.arraylist;

import java.util.ArrayList;

public class RemoveAllMethod {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list2.add(30);
		list2.add(40);
		list2.add(50);
		
		list1.removeAll(list2); // It will remove all the duplicate elements from list1 after comparing with list2
		
		System.out.println(list1); // [10, 20]
	}
}
