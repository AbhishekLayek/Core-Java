package Enum;

public class Main {
	public static void main(String[] args) {
		
		System.out.println(Day.MONDAY); // MONDAY
		
		Day[] days = Day.values();
		System.out.println("The Days Are: ");
		for(Day d: days) {
			System.out.println(d);
		}
	}
}
