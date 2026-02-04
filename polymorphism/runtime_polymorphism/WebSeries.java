package polymorphism.runtime_polymorphism;

public class WebSeries extends AmazonPrime{
	
	String nameOfWebSeries;
	
	public WebSeries(String nameOfWebSeries) {
		this.nameOfWebSeries = nameOfWebSeries;
	}
	
	@Override
	public void watch() {
		System.out.println("Watching " + nameOfWebSeries);
	}
}
