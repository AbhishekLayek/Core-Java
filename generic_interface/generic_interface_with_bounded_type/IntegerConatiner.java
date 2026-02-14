package generic_interface.generic_interface_with_bounded_type;

public class IntegerConatiner implements NumberContainer<Integer>{
	
	private Integer item;
	
	@Override
	public void add(Integer item) {
		this.item = item;
	}

	@Override
	public Integer get() {
		return item;
	}
	
	public static void main(String[] args) {
		IntegerConatiner ic = new IntegerConatiner();
		
		ic.add(10);
		System.out.println(ic.get()); // 10
	}
}
