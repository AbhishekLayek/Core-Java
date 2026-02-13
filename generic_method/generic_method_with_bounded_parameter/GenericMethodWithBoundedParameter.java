package generic_method.generic_method_with_bounded_parameter;

public class GenericMethodWithBoundedParameter {
	
	public <T extends Number> void display(T value) {
		System.out.println(value);
	}
}
