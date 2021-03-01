package oops;

class A {
	
	public void print() {
		System.out.println("I am A");
	}
}

class B extends A {
	
	public void print() {
		super.print();
		System.out.println("I am B");
	}
}

class C extends B {
	
	public void print() {
		super.print();
		System.out.println("I am C");
	}
}

public class MulilevelInheritance {
	public static void main(String[] args) {
		C c = new C();
		c.print();
	}
}
