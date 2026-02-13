package generic_constructor.generic_constructor_in_generic_class;

public class Main {
	public static void main(String[] args) {
		String str = new String("Hello");
		
		Test<String> test = new Test<>(str);
	}
}
