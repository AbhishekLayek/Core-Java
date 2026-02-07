package object_class;

public class ToStringMethodOverride {
	
	String name;
	
	public ToStringMethodOverride(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		ToStringMethodOverride t = new ToStringMethodOverride("Abhishek");
		
		System.out.println("Name: " + t); // Automatically
		System.out.println("Name: " + t.toString()); // Explicitly
	}
}
