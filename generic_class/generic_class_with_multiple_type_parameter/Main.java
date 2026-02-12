package generic_class.generic_class_with_multiple_type_parameter;

public class Main {
	public static void main(String[] args) {
		Pair<String,Integer> pair = new Pair<>("Age", 24);
		
		System.out.println("Key: " + pair.getKey()); // Key: Age
		System.out.println("Value: " + pair.getValue()); // Value: 24
	}
}
