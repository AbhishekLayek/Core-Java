package collection_framework.arraylist;

import java.util.ArrayList;

public class AddMethod {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(30);
		
		list.add(1, 20); // Add 20 in index 1.
		
		System.out.println(list); // [10, 20, 30]
	}
}
