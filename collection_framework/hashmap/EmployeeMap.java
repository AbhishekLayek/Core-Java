package collection_framework.hashmap;

import java.util.HashMap;

public class EmployeeMap {
	public static void main(String[] args) {
		HashMap<Employee, String> map = new HashMap<>();
		
		Employee e1 = new Employee("Abhishek", 101);
		Employee e2 = new Employee("Payel", 102);
		Employee e3 = new Employee("Abhishek", 101);
		
		map.put(e1, "Developer");
		map.put(e2, "Frontend Developer");
		map.put(e3, "Backend Developer");
		
		System.out.println("Size of Map: " + map.size()); // Size of Map: 2
		
		System.out.println("Value of e1: " + map.get(e1)); // Value of e1: Backend Developer
		System.out.println("Value of e3: " + map.get(e3)); // Value of e3: Backend Developer
	}
}
