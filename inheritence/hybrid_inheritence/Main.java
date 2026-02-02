package inheritence.hybrid_inheritence;

public class Main {
	public static void main(String[] args) {
		Son s = new Son();
		
		System.out.println("Son's Hair Color: " + s.hairColor);
		System.out.println("Son's Eye Color: " + s.eyeColor);
		System.out.println("Son's Height: " + s.height);
		
		s.writing();
		s.singing();
		s.playCricker();
		
		Daughter d = new Daughter();
		
		System.out.println("Daughter's Hair Color: " + d.hairColor);
		System.out.println("Daughter's Eye Color: " + d.eyeColor);
		System.out.println("Daughter's Height: " + d.height);
		
		d.writing();
		d.singing();
		d.dancing();
	}
}
