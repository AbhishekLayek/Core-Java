package reference_variable;

public class RefernceVariableExample {
	
	void sub2() {
		System.out.println("Hey I am Sub1");
	}
	
	void sub1() {
		System.out.println("Hey I am Sub1");
	}
	
	public static void main(String[] args) {
		
		RefernceVariableExample rf = new RefernceVariableExample();
		rf.sub1();
		rf.sub2();
	}
}
