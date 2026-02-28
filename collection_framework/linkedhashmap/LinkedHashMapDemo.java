/*
 * LinkedHashMap: LinkedHashMap class in Java belongs to java.util package that extends HashMap interface.
 * 
 * Key Features:
 * 
 * 1. Size is dynamic.
 * 2. We can store elements as form of key-value pair.
 * 3. Keys should be unique.
 * 4. Values can be duplicate.
 * 5. It will follow order of insertion by default.
 * 6. Default capacity is 16.
 * 7. Default load factor is 0.75.
 * 8. Can increase capacity by 2x.
 * 9. It's not thread-safe.
 */

package collection_framework.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>(); // By default it will follow order of insertion.
		
		map1.put("Orange", 10);
		map1.put("Apple", 20);
		map1.put("Guava", 30);
		
		for(Map.Entry<String, Integer> entry: map1.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		/*
		 * Output:
		 * 
		 * Orange : 10
		 * Apple : 20
		 * Guava : 30
		 */
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>(10, 0.3f, true); // It will follow access-order.
		
		map2.put("Orange", 10);
		map2.put("Apple", 20);
		map2.put("Guava", 30);
		
		map2.get("Apple"); // When we access any element, that element will move to last.
		
		for(Map.Entry<String, Integer> entry: map2.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		/*
		 * Ouput:
		 * 
		 * Orange : 10
		 * Guava : 30
		 * Apple : 20
		 */
		
	}
}
