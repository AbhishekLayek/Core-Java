package generic_method.generic_method_with_multiple_type_paramater;

public class Main {
	public static void main(String[] args) {
		GenericMethodWithMultipleParameter m = new GenericMethodWithMultipleParameter();
		
		m.pair("Age", 24); // Key: Age ,Value: 24
		m.pair(101, "Abhishek"); // Key: 101 ,Value: Abhishek
	}
}
