/*
 * HashSet: HashSet class in Java belongs to java.util package and it implements Set interface.
 * 
 * Key Features:
 * 
 * 1. It doesn't allow duplicate.
 * 2. It doesn't follow order of insertion.
 * 3. It is not thread safe.
 * 4. Default initial capacity is 16, default initial load factor is 0.75.
 */

package collection_framework.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(12);
		set.add(1);
		set.add(1);
		set.add(67);
		
		System.out.println(set); // [1, 67, 12]
	}
}
