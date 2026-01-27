package operators;

public class UnaryOperator {
	public static void main(String[] args) {
		int a = 2;
		System.out.println(a++); // Post-Increment(a = 2)
		System.out.println(++a); // P-Increment(a = 4)
		System.out.println(a--); // Post-Decrement( a = 4)
		System.out.println(--a); // Pre-Decrement(a = 2)
	}
}
