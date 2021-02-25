package oops;

class Student {
	
	public void display() {
		System.out.println("Student");
	}
}

public class ClassAndObject {
	public static void main(String[] args) {
		
		Student student = new Student(); // reference of Student class
		student.display();
	}
}
