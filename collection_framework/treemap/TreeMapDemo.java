/*
 * SortedMap: SortedMap interface in Java belongs to java.util pacakge and it extends Map interface. SortedMap stores keys in sorted order either by natural order or custom comparator.
 * 
 * NavigableMap: Navigable interface Java belongs to java.util pacakge and it extends SortedMap interface. NavigableMap allows us to navigate in map in both forward and reverse order.
 * 
 * TreeMap: TreeMap class in Java belongs to java.util pacakge and it implements NavigableMap interface. TreeMap stores key-value pairs in sorted order either by natural order or custom comparator.
 */

package collection_framework.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		SortedMap<Integer, String> map = new TreeMap<>();
		
		map.put(102, "Ajay");
		map.put(101, "Amit");
		map.put(104, "Rakesh");
		map.put(108, "Raktim");
		map.put(105, "Riya");
		
		System.out.println(map); // {101=Amit, 102=Ajay, 104=Rakesh, 105=Riya, 108=Raktim}
		
		System.out.println(map.firstKey()); // 101
		System.out.println(map.lastKey()); // 108
		
		System.out.println(map.headMap(104)); // {101=Amit, 102=Ajay}
		System.out.println(map.tailMap(104)); // {104=Rakesh, 105=Riya, 108=Raktim}
		System.out.println(map.subMap(102, 105)); // {102=Ajay, 104=Rakesh}

	}
}
