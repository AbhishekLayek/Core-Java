package collection_framework.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntrySet {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Rahul");
		map.put(2, "Riya");
		map.put(3, "Raj");
		
		Set<Map.Entry<Integer,String>> entries = map.entrySet();
		
		for(Map.Entry<Integer,String> entry: entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}

/*
 * Output:
 * 
 * 1 : Rahul
 * 2 : Riya
 * 3 : Raj
 */
