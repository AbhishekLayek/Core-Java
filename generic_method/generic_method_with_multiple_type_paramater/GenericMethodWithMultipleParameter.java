package generic_method.generic_method_with_multiple_type_paramater;

public class GenericMethodWithMultipleParameter {
	
	public <K,V> void pair(K key, V value) {
		System.out.println("Key: " + key + " ,Value: " + value);
	}
}
