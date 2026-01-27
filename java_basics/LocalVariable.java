package java_basics;

public class LocalVariable {
	public static void main(String[] args) {
		
		// Local Variable: Any variable, which is declared inside method is called local variable.
		
		int local;
		
		/* Rules:
		 * 1. Once local variable is declared, it has to be initialized or else it will throw CTE
		 * 2. Local variable cannot be classified as static or non-static.
		 * 3. Local variable don't have default values.
		 */
		
		local = 10;
		
		System.out.println(local);
	}
}
