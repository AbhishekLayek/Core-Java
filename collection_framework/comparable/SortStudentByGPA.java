package collection_framework.comparable;

import java.util.ArrayList;
import java.util.List;

public class SortStudentByGPA {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Ajay", 9.1));
		students.add(new Student("Rakesh", 9.8));
		students.add(new Student("Amit", 8.2));
		
		students.sort(null);
		
		for(Student s: students) {
			System.out.println(s.getName() + " : " + s.getGpa());
		}
	}
}

/*
 * Output:
 * Rakesh : 9.8
 * Ajay : 9.1
 * Amit : 8.2
 */
