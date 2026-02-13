package generic_constructor.generic_constructor_with_bounded_parameter;

public class NumberContainer {
	
	<N extends Number> NumberContainer(N number) {
		System.out.println("Number: " + number);
	}
}
