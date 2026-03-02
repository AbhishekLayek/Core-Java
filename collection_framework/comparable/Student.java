/*
 * Comparable: Comparable interface in Java is used to define natural ordering of objects of a class.
 * 
 * It enables objects to be compared and sorted automatically without using an external comparator.
 */

package collection_framework.comparable;

public class Student implements Comparable<Student>{
	private String name;
	private double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	@Override
	public int compareTo(Student o) {
		return Double.compare(o.getGpa(), this.getGpa()); // Sort Students Based On GPA in descending order
	}
}
