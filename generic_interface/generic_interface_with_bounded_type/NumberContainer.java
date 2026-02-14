package generic_interface.generic_interface_with_bounded_type;

public interface NumberContainer<N extends Number> {
	void add(N item);
	N get();
}
