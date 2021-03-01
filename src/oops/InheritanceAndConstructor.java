package oops;

// In Java, constructor of base class with no argument gets automatically called in derived class constructor.
// But, if we want to call parameterized constructor of base class, then we can call it using super(). 
// The point to note is base class constructor call must be the first line in derived class constructor. 
// For example, in the following program, super(_x) is first line derived class constructor.
class Fruit {
	
	int num;
	
	public Fruit(int num) {
		System.out.println("Fruit constructor! -> " + num);
	}
}

class Apple extends Fruit {
	
	public Apple(int num) {
		super(num);
		System.out.println("Apple Constructor!");
	}
}

public class InheritanceAndConstructor {
	public static void main(String[] args) {
		Apple obj = new Apple(13);
	}
}
