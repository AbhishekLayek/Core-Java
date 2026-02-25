/*
 * LinkedHashSet: LinkedHashSet class in Java belongs to java.util package and it extends HashSet class.
 * 
 * Key Features:
 * 
 * 1. It doesn't allow duplicate.
 * 2. It follow order of insertion.
 * 3. It is not thread safe.
 * 4. Default initial capacity is 16, default initial load factor is 0.75.
 */

package collection_framework.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		set.add(12);
		set.add(1);
		set.add(1);
		set.add(67);
		
		System.out.println(set); // [12, 1, 67]
	}
}
