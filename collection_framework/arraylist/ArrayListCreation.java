package collection_framework.arraylist;

import java.util.ArrayList;

public class ArrayListCreation {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("Hello");
		list.add(123);
		list.add(10.5);
		list.add(true);
		
		System.out.println(list); // [Hello, 123, 10.5, true]
	}
}
