package coreJava;

// Outer Class
class Outer {
	String name;
	
	public void show() {
		System.out.println("I am Outer.");
	}
	
	// Inner class
	class Inner {
		String name;
		
		public void display() {
			System.out.println("Hey, I am Inner One.");
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
	}
}
