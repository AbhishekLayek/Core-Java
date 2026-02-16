/*
 * Collections: Collections class in Java is a utility class provided by Collection Framework, that consist some static methods for performing common operations on Collection.
 */

package collection_framework.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(20);
		list.add(50);
		
		System.out.println("Before Sorting: " + list); // Before Sorting: [10, 40, 30, 20, 50]
		
		Collections.sort(list);
		
		System.out.println("After Sorting: " + list); // After Sorting: [10, 20, 30, 40, 50]
		
		int max = Collections.max(list);
		int min = Collections.min(list);
		
		System.out.println("Max: " + max + ", Min: " + min); // Max: 50, Min: 10
		
		Collections.reverse(list);
		
		System.out.println("After Reversing: " + list); // After Reversing: [50, 40, 30, 20, 10]
	}
}
