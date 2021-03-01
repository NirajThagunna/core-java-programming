package oops;

// Association is a relationship between two separate classes that establishes through their objects.
// Association refers to the relationship between multiple objects. 
// It refers to how objects are related to each other and how they are using each other's functionality. 
// Composition and aggregation are two types of association.
// In Object-Oriented programming, an Object communicates to other Object to use functionality and services provided by that object.
class Bank {
	private String name;
	
	public Bank() {}
	
	public Bank(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Employee {
	private String name;
	
	public Employee() {}
	
	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Association {
	public static void main(String[] args) {
		Bank bank = new Bank("NIC ASIA");
		Employee emp = new Employee();
		emp.setName("Niraj Thagunna");
		
		System.out.println(emp.getName() + " is the manager of " + bank.getName());
	}
}
