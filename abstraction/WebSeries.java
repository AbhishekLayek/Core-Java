package abstraction;

public class WebSeries implements Netflix{
	
	String nameOfWebSeries;
	
	public WebSeries(String nameOfWebSeries) {
		this.nameOfWebSeries = nameOfWebSeries;
	}
	
	@Override
	public void watch() {
		System.out.println("Watching " + nameOfWebSeries);
	}
}
