package abstraction;

public class User {
	public static void main(String[] args) {
		
		WebSeries w = new WebSeries("Money Heist");
		Movie m = new Movie("Red Notice");
		
		SinglePointOfContact.select(w);
		SinglePointOfContact.select(m);
	}
}
