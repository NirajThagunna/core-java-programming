package oops;

// Runtime polymorphism can't be achieved by data members
// In Java, we can override methods only, not the variables(data members), so runtime polymorphism cannot be achieved by 
// data members. 

// Static binding is done during compile-time while dynamic binding is done during run-time.
// private, final and static methods and variables uses static binding and bonded by compiler 
// while overridden methods are bonded during runtime based upon type of runtime object.
class Vehicle {
	
	public int speed = 100;
	
	public void run() {
		System.out.println("Vehcle is going...");
	}
}

class Car extends Vehicle {
	
	public int speed = 200;
	
	@Override
	public void run() {
		System.out.println("Car is running....");
	}
}

public class RuntimePolymorphism {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Car(); // Upcasting
		vehicle.run();
		System.out.println(vehicle.speed);
	}
}
