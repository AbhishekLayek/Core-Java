package object_class;

public class HashCodeMethodOverride {
	
	@Override
	public int hashCode() {
		return 1234;
	}
	
	public static void main(String[] args) {
		HashCodeMethodOverride h = new HashCodeMethodOverride();
		
		System.out.println(h.hashCode()); // 1234
	}
}
