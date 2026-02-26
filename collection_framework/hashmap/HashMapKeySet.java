package collection_framework.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapKeySet {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Rahul");
		map.put(2, "Riya");
		map.put(3, "Raj");
		
		Set<Integer> keys = map.keySet(); // keySet() method will return a Set of Keys
		
		for(Integer k: keys) {
			System.out.println(map.get(k));
		}
	}
}

/*
 * Output:
 * 
 * Rahul
 * Riya
 * Raj
 */
