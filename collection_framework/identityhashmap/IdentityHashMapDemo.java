/*
 * IdentityHashMap: IdentityHashMap class in Java belongs to java.util package that implements Map interface. IdentityHashMap compares keys using reference equality(==) instead of equals() method.
 */

package collection_framework.identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		
		String key1 = new String("key");
		String key2 = new String("key");
		
		Map<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put(key1, 1);
		hashMap.put(key2, 2);
		
		/*
		 * In Case Of HashMap:
		 * 
		 * 1) If a class having its own hashcode method  then HashMap will use that to generate hashcode, or else it'll use hascode method of Object class.
		 * 2) In this case, String class have its own hashcode method which will generate hashcode based on values rather than address. So here hascode will be same for key1 and key2 as they have same value key.
		 * 3) Same hashcode will be used to calculate index, so same index will come. So we need to insert two entries on same index.
		 * 4) But before that HashMap will compare keys using equals() method. equals() method will compare by values.
		 * 5) Here value of key1 & key2 is same. so first entry will be replaced by second entry.
		 * 6) Final result will be only one entry.
		 */
		
		System.out.println(hashMap); // {key=2}
		
		Map<String, Integer> identityHashMap = new IdentityHashMap<>();
		
		identityHashMap.put(key1, 1);
		identityHashMap.put(key2, 2);
		
		/*
		 * In Case Of IdentityHashMap:
		 * 
		 * 1) If a class having its own hashcode method  even though IdentityHashMap will use hascode method of Object class.
		 * 2) In this case, String class have its own hashcode method but IdentityHashMap will use hashcode method of Object class which will generate hashcode based on addresses.
		 * 3) Here key1 and key2 refering different address so different hashcode will generate. Different hascode means different indexes.
		 * 4) If hascode is same then in same index we need to add two entries, but before that IdentityHashMap will compare keys using reference equals(==), which will cpmapare keys by addresses.
		 * 5) Here value of key1 & key2 is same. so first entry will be replaced by second entry.
		 * 6) So we will get two entries.
		 */
		
		System.out.println(identityHashMap); // {key=1, key=2}
	}
}
