package collection_framework.comparator;

import java.util.ArrayList;
import java.util.List;

public class SortStudentByGPA {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Abhishek", 8.95));
		students.add(new Student("Deb", 6.1));
		students.add(new Student("Rakesh", 8.1));
		students.add(new Student("Tapan", 7.9));
		
		students.sort((s1, s2) ->{
			if(s2.getGpa() - s1.getGpa() > 0) {
				return 1;
			}
			else if(s2.getGpa() - s1.getGpa() < 0) {
				return -1;
			}
			else {
				return 0;
			}
		});
		
		for(Student s: students) {
			System.out.println(s.getName() + ": " + s.getGpa());
		}
		
		/*
		 * Output:
		 * 
		 * Abhishek: 8.95
		 * Rakesh: 8.1
		 * Tapan: 7.9
		 * Deb: 6.1
		 */
	}
}
