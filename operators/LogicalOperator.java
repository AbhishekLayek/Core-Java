package operators;

public class LogicalOperator {
	public static void main(String[] args) {
		
		// Logical AND Operator(&&)
		int age = 18;
		boolean license = true;
		
		if(age >= 18 && license == true) {
			System.out.println("You're Eligible For Driving");
		}
		else {
			System.out.println("You're Not Eligible For Driving");
		}
		
		// Logical OR Operator(||)
		String jobRole = "Backend Developer";
		
		if(jobRole == "Frontend Developer" || jobRole == "Backend Developer") {
			System.out.println("You're A Software Developer");
		}
		else {
			System.out.println("You're Not A Software Developer");
		}
		
		// Logical NOT Operator(!)
		
		boolean isValid = false;
		
		if(!isValid) {
			System.out.println("Access Granted");
		}
		else {
			System.out.println("Access Denied");
		}
	}
}
