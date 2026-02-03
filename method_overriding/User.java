/*
 * Method Overriding: Developing a method inside subclass with the same name and signature as in the superclass but variations in subclass implementation is called as Method Overriding.
 * 
 * Key Points:
 * 1. There should be 'Is A Relationship' or 'Inheritence',
 * 2. Static method cannot be overridden.
 * 3. Final method cannot be overridden.
 * 4. Private method cannot be overridden.
 */


package method_overriding;

public class User {
	public static void main(String[] args) {
		
		WhatsApp_V2 w = new WhatsApp_V2();
		
		w.feature();
	}
}
