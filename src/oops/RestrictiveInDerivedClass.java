package oops;

class X {
	public int value = 50;
	
	private void print() {
		System.out.println("Hello!");
	}
}

class Y extends X {
	public int value = 100;
	
	public void print() {
		System.out.println("Hi!");
	}
}

public class RestrictiveInDerivedClass {
	public static void main(String[] args) {
		Y y = new Y();
		y.print();
		System.out.println(y.value);
		
		X x = y;
		System.out.println(x.value);
	}
}

/*
 * In Java, it is compiler error to give more restrictive access to a derived class function which overrides a base class 
 * function. For example, if there is a function public void foo() in base class and if it is overridden in derived class, 
 * then access specifier for foo() cannot be anything other than public in derived class. If foo() is private function in 
 * base class, then access specifier for it can be anything in derived class.
 */



