package abstraction;

public class Movie implements Netflix{
	
	String nameOfMovie;
	
	public Movie(String nameOfMovie) {
		this.nameOfMovie = nameOfMovie;
	}
	
	@Override
	public void watch() {
		System.out.println("Watching " + nameOfMovie);
	}
}
