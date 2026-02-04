package polymorphism.compiletime_polymorphism;

public class Calculator {
	
	public int add(int n1, int n2) {
		return (n1+n2);
	}
	
	public int add(int n1, int n2, int n3) {
		return (n1+n2+n3);
	}
	
	public double add(double n1, double n2) {
		return (n1+n2);
	}
}
