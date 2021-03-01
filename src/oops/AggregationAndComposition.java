package oops;

class Engine {
	
	public void work() {
		System.out.println("Engine of bike has been started!");
	}
}

final class Bike {
	
	private final Engine engine; // Composition
	// private Engine engine; // Aggregation
	
	public Bike(Engine engine) {
		this.engine = engine;
	}
	
	// Bike start moving by starting engine
	public void move() {
		
		if (engine != null) {
			engine.work();
			System.out.println("Bike is moving...");
		}
	}
}

public class AggregationAndComposition {
	public static void main(String[] args) {
		Engine engine = new Engine();
		
		Bike bike = new Bike(engine);
		bike.move();
	}
}

/*
 * In case of aggregation, the Car also performs its functions through an Engine. 
 * but the Engine is not always an internal part of the Car. 
 * An engine can be swapped out or even can be removed from the car. 
 * That’ why we make The Engine type field non-final.
 */


