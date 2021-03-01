package oops;

// Why use Java interface?
// It is used to achieve abstraction.
// By interface, we can support the functionality of multiple inheritance.
// It can be used to achieve loose coupling.
// There can be only abstract methods in the Java interface, not method body.
// Java Interface also represents the IS-A relationship.
// It cannot be instantiated just like the abstract class.

// The Java compiler adds public and abstract keywords before the interface method. 
// Moreover, it adds public, static and final keywords before data members.

// Since Java 8, we can have method body in interface. But we need to make it default method.

// methods - public and abstract
// data members - public, static and final

// The relationships between classes and interfaces
// class -> extends -> class
// class -> implements -> interface
// interface -> extends -> interface
interface Employee1 {
	int salary = 5000; // public static final int salary = 5000;
	
	void print(); // public abstract
}

interface Manager {
	int salary = 10000; // public static final
	
	void print(); // public abstract
	
	// default method that have a body
	// Since Java 8, we can have method body in interface. But we need to make it default method.
	default void show() {
		System.out.println("Hey, I am the Manager of this company.");
	}
	
	// Since Java 8, we can have static method in interface
	static void name(String name) {
		System.out.println(name);
	}
}

class Bank1 implements Employee1, Manager {
	private String name;
	
	public Bank1(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println(getName());
	}
}

public class Interface {
	public static void main(String[] args) {
		Manager obj = new Bank1("NIC ASIA");
		obj.print();
		obj.show();
		Manager.name("Niraj Thagunna");
		System.out.println(Employee1.salary);
	}
}

// As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of 
// ambiguity. However, it is supported in case of an interface because there is no ambiguity. 
// It is because its implementation is provided by the implementation class.

