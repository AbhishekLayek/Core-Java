package inner_class.annonymous_inner_class;

public class User {
	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart(2000);
		
		// Annonymous Inner Class
		cart.processPayment(new Payment() {
			@Override
			public void pay(double Amount) {
				System.out.println("Paid " + Amount + " Using Credit Card");
			}
		});
	}
}
