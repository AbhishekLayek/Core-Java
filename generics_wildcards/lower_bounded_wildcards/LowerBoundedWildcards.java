package generics_wildcards.lower_bounded_wildcards;

import java.util.ArrayList;

public class LowerBoundedWildcards {
	public void displayElement(ArrayList<? super Integer> list) {
		// Here ? can be Integer or super class of Integer class like Number, Object.
		for(Object o: list) {
			System.out.println(o);
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Number> list = new ArrayList<>();
		
		list.add(10);
		list.add(3.14);
		
		LowerBoundedWildcards w = new LowerBoundedWildcards();
		
		w.displayElement(list);
	}
}
