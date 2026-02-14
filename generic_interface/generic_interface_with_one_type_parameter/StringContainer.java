package generic_interface.generic_interface_with_one_type_parameter;

public class StringContainer implements Container<String>{
	
	private String item;
	
	@Override
	public void add(String item) {
		this.item = item;
	}
	
	@Override
	public String get() {
		return item;
	}
	
	public static void main(String[] args) {
		StringContainer sc = new StringContainer();
		
		sc.add("Hello");
		System.out.println(sc.get());
	}
}
