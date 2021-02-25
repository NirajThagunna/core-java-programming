package oops;

class Student2 {

	// member variables - private
	private int id;
	private String name;
	private String Address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		
		Student2 student = new Student2();
		student.setId(80);
		student.setName("Niraj Thagunna");
		student.setAddress("Nepal");
		System.out.println(student);
	}
}
