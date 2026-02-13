package generic_constructor.generic_constructor_with_multiple_type_parameter;

public class Pair {
	
	<A,B> Pair(A key, B value){
		System.out.println("Key: " + key + " ,Value: " + value);
	}
	
	public static void main(String[] args) {
		new Pair("Id", 101); // Key: Id ,Value: 101
		new Pair(101, "Abhishek"); // Key: 101 ,Value: Abhishek
	}
}
