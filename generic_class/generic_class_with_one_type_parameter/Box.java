package generic_class.generic_class_with_one_type_parameter;

public class Box<T> {
	
	private T value;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
}
