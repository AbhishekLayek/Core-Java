package final_keyword.final_class;

public class Test {
	public static void main(String[] args) {
		
		FinalClass f = new FinalClass();
		
		System.out.println(FinalClass.name);
		System.out.println(f.id);
		
		FinalClass.eat();
		f.work();
	}
}
