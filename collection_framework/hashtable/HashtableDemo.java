/*
 * Hashtable: Hashtable class in Java belongs to java.util pacakge and it's one of the legacy classes in Java that implements Map interface.
 * 
 * Key Features:
 * 
 * 1. It'll not allow null keys and values.
 * 2. It is synchronized means thread safe.
 */

package collection_framework.hashtable;

import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args) throws InterruptedException {
		
		Hashtable<Integer, String> hashTable = new Hashtable<>();
		
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 1000; i++) {
				hashTable.put(i, "Thread 1");
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 1000; i < 2000; i++) {
				hashTable.put(i, "Thread 2");
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(hashTable.size()); // 2000
	}
}
