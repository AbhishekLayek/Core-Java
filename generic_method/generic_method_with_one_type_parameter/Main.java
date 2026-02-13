package generic_method.generic_method_with_one_type_parameter;

public class Main {
	public static void main(String[] args) {
		GenericMethodWithOneParameter m = new GenericMethodWithOneParameter();
		
		m.display("Java"); // Java
		m.display(123); // 123
	}
}
