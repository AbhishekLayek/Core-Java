/*
 * EnumMap: EnumMap class in Java belongs to java.util pacakge and it's a special implementation for Map interface for enumeration type.
 */

package collection_framework.enummap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
	public static void main(String[] args) {
		Map<Day, String> map = new EnumMap<>(Day.class);
		
		map.put(Day.MONDAY, "Walk");
		map.put(Day.TUESDAY, "GYM");
		
		System.out.println(map); // {MONDAY=Walk, TUESDAY=GYM}
	}
}
