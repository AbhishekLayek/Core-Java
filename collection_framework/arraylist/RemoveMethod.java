package collection_framework.arraylist;

import java.util.ArrayList;

public class RemoveMethod {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list); // [10, 20, 30, 40, 50]
		
		list.remove(1); // It will remove element present at index 1
		
		System.out.println(list); // [10, 30, 40, 50]
	}
}
