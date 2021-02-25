package oops;

class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void display() {
		System.out.println(name);
	}
}

class Student1 extends Person {
	
	private int id;
	
	public Student1(String name, int id) {
		super(name);
		this.id = id;
	}

	public void details() {
		System.out.println(id + ", " + super.getName());
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Student1 std = new Student1("Niraj Thagunna", 6317080);
		std.details();
	}
}
