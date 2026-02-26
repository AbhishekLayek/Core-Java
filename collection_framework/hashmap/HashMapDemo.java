/*
 * HashMap: HashMap class in Java belongs to java.util package that implements Map interface.
 * 
 * Key Features:
 * 
 * 1. Size is dynamic.
 * 2. We can store elements as form of key-value pair.
 * 3. Keys should be unique.
 * 4. Values can be duplicate.
 * 5. Doesn't follow any order.
 * 6. Default capacity is 16.
 * 7. Default load factor is 0.75.
 * 8. Can increase capacity by 2x.
 * 9. It's not thread-safe.
 */

package collection_framework.hashmap;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		// Add Element
		map.put(1, "Rahul");
		map.put(2, "Riya");
		map.put(3, "Raj");
		
		System.out.println(map); // {1=Rahul, 2=Riya, 3=Raj}
		
		// Access Element
		String student = map.get(2);
		System.out.println(student); // Riya
		
		System.out.println(map.containsKey(2)); // true
		System.out.println(map.containsValue("Rocky")); // false
		
		// Remove Element
		map.remove(1);
		
		System.out.println(map); // {2=Riya, 3=Raj}
	}
}
