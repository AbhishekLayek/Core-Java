package static_nonstatic;

public class EmployeeApp {
	public static void main(String[] args) {
		
		System.out.println("Company Name: " + Employee.companyName);
		Employee.login();
		Employee.logout();
		
		Employee emp1 = new Employee();
		
		emp1.empId = 101;
		emp1.name = "Abhishek";
		emp1.age = 25;
		emp1.designation = "Backend Developer";
		emp1.monthlySal = 200000.00;
		
		emp1.login(); // login() will be same
		emp1.logout(); // logout() will be same
		System.out.println(emp1.name + " Works In " + emp1.companyName); // companyName will be same
		System.out.println("Annual Salary Of " + emp1.name + " Is " + emp1.getAnualSalary());
		
		Employee emp2 = new Employee();
		
		emp2.empId = 102;
		emp2.name = "Payel";
		emp2.age = 24;
		emp2.designation = "Backend Deveolper";
		emp2.monthlySal = 180000.00;
		
		emp1.login(); // login() will be same
		emp1.logout(); // logout() will be same
		
		System.out.println(emp2.name + " Works In " + emp2.companyName); // companyName will be same 
		System.out.println("Annual Salary Of " + emp1.name + " Is " + emp1.getAnualSalary());
	}
}
