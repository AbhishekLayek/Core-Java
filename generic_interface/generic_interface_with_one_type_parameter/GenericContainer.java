package generic_interface.generic_interface_with_one_type_parameter;

public class GenericContainer<T> implements Container<T> {
	private T item;
	
	@Override
	public void add(T item) {
		this.item = item;
	}
	
	@Override
	public T get() {
		return item;
	}
	
	public static void main(String[] args) {
		GenericContainer<Integer> gc = new GenericContainer<>();
		
		gc.add(10);
		System.out.println(gc.get()); // 10
	}
}
