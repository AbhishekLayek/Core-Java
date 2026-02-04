package polymorphism.runtime_polymorphism;

public class Movie extends AmazonPrime{
	
	String nameOfMovie;
	
	public Movie(String nameOfMovie) {
		this.nameOfMovie = nameOfMovie;
	}
	
	@Override
	public void watch() {
		System.out.println("Watching " + nameOfMovie);
	}
}
