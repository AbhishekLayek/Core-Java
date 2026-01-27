package operators;

public class RelationalOperator {
	public static void main(String[] args) {
		
		// Equalto Operator(==)
		int savedpin = 1234;
		int enteredpin = 1234;
		
		if(savedpin == enteredpin) {
			System.out.println("Login Successfull");
		}
		else {
			System.out.println("Login Failed");
		}
		
		// Not-Equalto Operator(!=)
		String role = "User";
		
		if(role != "Admin") {
			System.out.println("Access Denied");
		}
		else {
			System.out.println("Access Granted");
		}
		
		// Greater Than Operator(>)
		int marks = 45;
		
		if(marks > 40) {
			System.out.println("Passed The Exam");
		}
		else {
			System.out.println("Failed The Exam");
		}
		
		// Greater Than or Equal To Operator(>=)
		int age = 18;
		
		if(age >= 18) {
			System.out.println("You're Eligible For Vote");
		}
		else {
			System.out.println("Yo're Not Eligible For Vote");
		}
		
		// Less Than Operator(<)
		int teamAScore = 95;
		int teamBScore = 90;
		
		if(teamAScore < teamBScore) {
			System.out.println("Team B Wins");
		}
		else {
			System.out.println("Team A Wins");
		}
		
		// Less Than Or Equal To Operator(<=)
		
		int attendance = 75;
		
		if(attendance <= 75) {
			System.out.println("Not Eligible To Seat In Exam");
		}
		else {
			System.out.println("Eligible To Seat In Exam");
		}
	}
}
