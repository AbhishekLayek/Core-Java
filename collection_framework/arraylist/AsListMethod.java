package collection_framework.arraylist;

import java.util.Arrays;
import java.util.List;

public class AsListMethod {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("SQL", "Java", "Python");
		
		// list.add("C"); // We can't add elements, It will throw exception
		
		list.set(0, "C++"); // We can replace
		
		System.out.println(list); // [C++, Java, Python]
		
	}
}
