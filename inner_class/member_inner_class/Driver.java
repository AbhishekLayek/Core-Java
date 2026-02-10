package inner_class.member_inner_class;

public class Driver {
	public static void main(String[] args) {
		
		Car car = new Car("BMW");
		
		Car.Engine engine = car.new Engine();
		
		engine.start();
		engine.stop();
	}
}
