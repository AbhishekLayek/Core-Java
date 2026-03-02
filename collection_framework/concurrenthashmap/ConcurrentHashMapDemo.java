/*
 * ConcurrentHashMap: ConcurrentHashMap class in Java belongs to java.util.concurrent package that implements ConcurrentMap interface.
 * 
 * Key Features:
 * 
 * 1. It is synchronized means thread-safe.
 * 2. Unordered.
 * 
 * Internal Working:
 * 
 * After Java 8 it don't have any segment. It uses Compare and Swap method.
 */

package collection_framework.concurrenthashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
			
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		
		map.put(1, "Milk");
		map.put(2, "Eggs");
		map.put(3, "Bread");
		
		System.out.println("Initial Map: " + map);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
			map.put(4, "Butter");
		}
		
		System.out.println("Final Map: " + map);
	}
}

/*
 * Output:
 * Initial Map: {1=Milk, 2=Eggs, 3=Bread}
 * 1 : Milk
 * 2 : Eggs
 * 3 : Bread
 * 4 : Butter
 * Final Map: {1=Milk, 2=Eggs, 3=Bread, 4=Butter}
 */
