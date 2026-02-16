package collection_framework.comparator;

import java.util.ArrayList;
import java.util.List;

public class SortingInteger {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(40);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(50);
		
		list.sort(null); // By default it will sort in ascending order
		
		System.out.println(list); // [10, 20, 30, 40, 50]
		
		list.sort(new IntegerComparator()); // It will sort in descending order
		
		System.out.println(list); // [50, 40, 30, 20, 10]
	}
}
