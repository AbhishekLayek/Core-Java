package generic_constructor.generic_constructor_in_generic_class;

public class Test<T> {
	
	<U> Test(U input){
		System.out.println(input.getClass().getName());;
	}
	
}
