/*
 * Enum: In Java Enumeration or Enum serves the purpose of representing a group of constant values.
 */

package Enum;

public enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

/*
 * Internally it will convert into a class
 * 
 * public final class Day extends java.lang.Enum<Day>{
 * 
 * 		public static final Day SUNDAY = new Day("SUNDAY" , 0);
 * 		public static final Day MONDAY = new Day("MONDAY" , 1);
 * 		public static final Day TUESDAY = new Day("TWEDNESDAY" , 2);
 * 		public static final Day WEDNESDAY = new Day("WEDNESDAY" , 3);
 * 		public static final Day THURSDAY = new Day("THURSDAY" , 4);
 * 		public static final Day FRIDAY = new Day("FRIDAY" , 5);
 * 		public static final Day SATURDAY = new Day("SATURDAY" , 6);
 * 
 * 		private static final Day[] VALUES = { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
 * 
 * 		private Day(String name, int ordinal){
 * 			super(name,ordinal);
 * 		}
 * 
 * 		public static Day[] values(){
 * 			return VALUES.clone();
 * 		}
 * 
 * 		public static Day ValueOf(String name){
 * 			for(Day day: VALUES){
 * 				if(day.name().equals(name)){
 * 					return day;
 * 				}
 * 			}
 * 			throw new IllegalArgumentException("No Enum Constant " + name);
 * 		}
 * }
 */
