package generic_class.generic_class_with_one_type_parameter;

public class Main {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		
		box.setValue(10);
		Integer i = box.getValue();
		
		System.out.println(i);
	}
}
