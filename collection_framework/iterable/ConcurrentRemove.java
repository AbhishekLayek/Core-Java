package collection_framework.iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentRemove {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(Arrays.asList("Java","Python","JavaScript"));
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String value = itr.next();
			if(value.equals("Python")) {
				itr.remove();
			}
		}
		
		/*
		 * Note:
		 * In ArrayList if we want to perform read and remove operation together then we'll get ConcurrentModificationException.
		 * 
		 * But in Iterator we have remove method, if we use it we'll not get ConcurrentModificationException.
		 */
		
		System.out.println(list); // [Java, JavaScript]
	}
}
