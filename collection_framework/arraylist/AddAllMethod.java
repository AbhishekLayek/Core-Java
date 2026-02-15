package collection_framework.arraylist;

import java.util.ArrayList;

public class AddAllMethod {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list2.add(30);
		list2.add(40);
		
		list1.addAll(list2); // It will add all elements of list2 at the end of list 1
		
		System.out.println(list1); // [10, 20, 30, 40]
		
		ArrayList<Integer> list3 = new ArrayList<>();
		
		list3.add(50);
		list3.add(60);
		
		list3.addAll(1, list2); // It will add all the elements of list2 at index 1 of list3
		
		System.out.println(list3); // [50, 30, 40, 60]
	}
}
