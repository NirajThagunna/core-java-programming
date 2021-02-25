package oops;

// It needs to be extended and it's methods implemented
// It cannot be instantiated - we cannot instantiated abstract class using new keyword
abstract class Shape {
	
	// data members
	private String color;
	
	// Constructor
	public Shape(String color) {
		System.out.println("Shape Constructor is initialized!");
		this.color = color;
	}
	
	// getting the color
	public String getColor() {
		return color;
	}
	
	// abstract method
	public abstract void show();
	
	// non-abstract methods
	public void display() {
		System.out.println("Found Shape!");
	}
}

// Triangle class will extend Shape class and implements it's abstract class
class Triangle extends Shape {
	
	public Triangle(String color) {
		super(color); // calling the Shape's constructor
		System.out.println("Trianle Constructor is initialized!");
	}
	
	@Override
	public void show() {
		System.out.println("Triangle" + " = " + super.getColor());
	}
}

public class Abstraction {
	public static void main(String[] args) {
		
		Triangle triangle = new Triangle("B/W");
		triangle.display();
		triangle.show();
	}
}
