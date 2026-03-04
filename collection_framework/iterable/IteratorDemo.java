/*
 * Iterable: Iterable interface in Java belongs to java.lang pacakge and it represents a collection of elements that can be iterated one by one.
 * 			
 * 		   public interface Iterable<T>{
 *   		   Iterator<T> iterator();
 * 		   }
 * 
 * Iterator: Iterator interface in Java belongs to java.util pacakge and it is used to iterate elements one by one from a collection.
 * 
 *         public interface Iterator<E>{
 *             boolean hasnNext();
 *             E next();
 *             void remove();
 *         }
 *         
 * hasNext(): It will return true if next element is present.
 * next(): It will return the next element.
 * remove(): It will remove the current element.
 */

package collection_framework.iterable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java","Python","JavaScript");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String value = itr.next();
			System.out.println(value);
		}
	}
}

/*
 * Output:
 * 
 * Java
 * Python
 * JavaScript
 */
