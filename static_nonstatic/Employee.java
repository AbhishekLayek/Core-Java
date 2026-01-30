/*
 * static: static belongs to class rather than instance of class. It will be shared with all the instances of that particular class.
 * non-static: non-static belongs to specific instance of a class.
 */

package static_nonstatic;

public class Employee {
	
	static String companyName = "Microsoft"; // companyName will be same for all the employees.
	
	int empId;
	String name;
	int age;
	String designation;
	double monthlySal;
	
	// All employee will perform login and logout
	static void login() {
		System.out.println("Logged In");
	}
	static void logout() {
		System.out.println("Logged Out");
	}
	
	// For different employees AnualSalary will be different.
	double getAnualSalary() {
		return monthlySal * 12;
	}
}
