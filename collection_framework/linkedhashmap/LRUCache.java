package collection_framework.linkedhashmap;

import java.util.LinkedHashMap;

public class LRUCache<K,V> extends LinkedHashMap<K, V>{
	
	private int capacity;
	
	public LRUCache(int capacity) {
		super(capacity,0.75f,true);
		this.capacity = capacity;
	}
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return size() > capacity;
	}
	
	public static void main(String[] args) {
		
		LRUCache<String, Integer> cache = new LRUCache<>(3);
		
		cache.put("Raj", 10);
		cache.put("Rakesh", 20);
		cache.put("Riya", 30);
		
		System.out.println(cache); // {Raj=10, Rakesh=20, Riya=30}
		
		cache.put("Rahul", 40); // Raj will be removed
		
		System.out.println(cache); // {Rakesh=20, Riya=30, Rahul=40}
	}
}
