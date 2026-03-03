package collection_framework.immutablemap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {
	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(1, "Raj");
		map1.put(2, "Ram");
		map1.put(3, "Rockey");
		
		System.out.println(map1); // {1=Raj, 2=Ram, 3=Rockey}
		
		Map<Integer, String> map2 = Collections.unmodifiableMap(map1); // It will make map2 as immutable.
		
		System.out.println(map2); // {1=Raj, 2=Ram, 3=Rockey}
		
		Map<Integer, String> map3 = Map.of(1,"Rakesh",2,"Riya",3,"Ajay"); // If we create map using Map.of then the map will be immutable, but has a limitation that it can consist only 10 entries.
		
		System.out.println(map3); // {3=Ajay, 2=Riya, 1=Rakesh}
		
		Map<Integer, String> map4 = Map.ofEntries(Map.entry(1, "Apple"), Map.entry(2, "Banana"), Map.entry(3, "Orange")); // Here there is no limitation, we can insert as many entries as we want.
		
		System.out.println(map4); // {2=Banana, 3=Orange, 1=Apple}
	}
}
