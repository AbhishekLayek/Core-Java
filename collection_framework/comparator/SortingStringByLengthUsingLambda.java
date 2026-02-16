package collection_framework.comparator;

import java.util.Arrays;
import java.util.List;

public class SortingStringByLengthUsingLambda {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Banana", "Date" , "Apple");
		
		list.sort((s1, s2) -> s2.length() - s1.length());
		
		System.out.println(list); // [Banana, Apple, Date]
	}
}
