package methods;

public class MainMethodOverloading {
	
	static void main(int n1, int n2) {
		System.out.println(n1*n2);
	}
	
	static void main(int n1, int n2, int n3) {
		System.out.println(n1*n2*n3);
	}
	
	static void main(double n1, double n2) {
		System.out.println(n1*n2);
	}
	
	public static void main(String[] args) {
		main(10,20);
		main(10,20,30);
		main(10.5,20.5);
	}
}
