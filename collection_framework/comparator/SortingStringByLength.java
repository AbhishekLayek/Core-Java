package collection_framework.comparator;

import java.util.Arrays;
import java.util.List;

public class SortingStringByLength {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Banana", "Date" , "Apple");
		
		list.sort(new StringComparator()); // It will sort String By Length In Descending Order
		
		System.out.println(list); // [Banana, Apple, Date]
	}
}
