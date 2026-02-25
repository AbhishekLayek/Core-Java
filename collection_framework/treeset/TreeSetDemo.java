/*
 * TreeSet: TreeSet class in Java belongs to java.util package and it implements NavigableSet interface.
 * 
 * Key Features:
 * 
 * 1. It doesn't allow duplicate.
 * 2. It doesn't allow null.
 * 3. It doesn't follow order of insertion.
 * 4. It is not thread safe.
 * 5. Default initial capacity is 16, default initial load factor is 0.75.
 * 6. It is completely auto-sorted.
 */

package collection_framework.treeset;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(12);
		set.add(1);
		set.add(1);
		set.add(67);
		
		System.out.println(set); // [1, 12, 67]
	}
}
