package java_basics;

public class GlobalVariable {
	
	// Global Variable: Any variable, which is declared outside method but inside the class is called as Global Variable.
	
	static int global1 = 10;
	static int global2;
	
	/*
	 * Rules:
	 * 1. Once global variable is declared, we can't initialize or re-initialize immediate in the next line or else it will throw CTE
	 * 2. Global variable can be classified as static and non-static.
	 * 3. Global variable have default values.
	 */
	
	public static void main(String[] args) {
		System.out.println(global1);
		System.out.println(global2); // Default value will print, since it's not initialized
	}
}
