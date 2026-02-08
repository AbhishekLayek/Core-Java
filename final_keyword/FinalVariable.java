/*
 * Final Keyword: Final keyword in Java is used to restrict the modification of members.
 */


package final_keyword;

public class FinalVariable {
	
	// Final Variable: If any variable declared with final keyword and also initialized in same line, the it'll become constant. Later we can't initialize it again.
	final double pi = 3.14;
	
	// Blank Final Variable: If any variable declared with final keyword, but not initialized then it's called blank final variable. It must be initialized inside constructor or instance initializer block only once.
	final int f;
	
	{
		f = 10;
	}
	
	// Static Final Variable: If any variable declared with static and final keyword and also initialized in same line. It'll represent constant and shared among all instances.
	static final double PI = 3.14159;
	
	// Static Blank Final Variable: If any variable declared with static and final keyword but not initialized. It must be initialized only once within static initializer block. It'll represent constant and shared among all instances.
	static final int sf;
	
	static {
		sf = 20;
	}
	
	String name;
	
	public FinalVariable(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		// Local Final Variable: If we declare any final variable inside method or block, then it's called local final variable. It must be initialize within the method or block.
		final int a;
		a = 20;
		
		// Final Reference Variable: It'll refer to only one object, not allowed to refer other object. We can change the internal state of object.
		final FinalVariable fv = new FinalVariable("Abhi");
		
		fv.name = "Abhishek";
		
	//	fv = new FinalVariable("Dev"); --> Not Allowed
		
		
		System.out.println(fv.pi);
		System.out.println(fv.f);
		System.out.println(FinalVariable.PI);
		System.out.println(FinalVariable.sf);
		System.out.println(a);
		System.out.println(fv.name);
	}

}
