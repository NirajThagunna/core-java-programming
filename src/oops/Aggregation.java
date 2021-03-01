package oops;

import java.util.ArrayList;
import java.util.List;

// It is a special form of Association where:
// It represents Has-A relationship.
// It is a unidirectional association i.e. a one way relationship. 
// For example, department can have students but vice versa is not possible and thus unidirectional in nature.
// In Aggregation, both the entries can survive individually which means ending one entity will not effect the other entity
// Aggregation is a weak association. 
// An association is said to be aggregation if both Objects can exist independently.

// Student class
class Students {
	private String name;
	private int id;
	private String department;
	
	public Students() {}

	public Students(String name, int id, String department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}

// Department class contains the list of students and it is related to the student class through it's object.
class Department {
	private String deptName;
	private List<Students> students;
	
	public Department(String deptName, List<Students> students) {
		this.deptName = deptName;
		this.students = students;
	}
	
	// return the list of students of the dept
	public List<Students> getStudents() {
		return students;
	}
}

// Institute class contains the list of departments objects and connected through it's object
class Institute {
	private String instituteName;
	private List<Department> departments;
	
	public Institute(String instituteName, List<Department> departments) {
		this.instituteName = instituteName;
		this.departments = departments;
	}
	
	// Counts the total number of students of all departments
	public int getTotalStudentsOfAllDept() {
		
		int countStudents = 0;
		List<Students> students;
		
		for (Department dept : departments) {
			students = dept.getStudents();
			
			for (Students student : students) {
				countStudents++;
			}
		}
		
		return countStudents;
	}
}

// Aggregation
public class Aggregation {
	public static void main(String[] args) {
		Students s1 = new Students("Niraj", 80, "CSE");
		Students s2 = new Students("Niru", 81, "CSE");
		Students s3 = new Students("Aarjit", 82, "ME");
		Students s4 = new Students("Ram", 83, "ME");
		Students s5 = new Students("Buddha", 84, "Civil");
		
		// Making a list of CSE Students
		List<Students> cseStudents = new ArrayList<Students>();
		cseStudents.add(s1);
		cseStudents.add(s2);
		
		// Making a list of ME students
		List<Students> meStudents = new ArrayList<Students>();
		meStudents.add(s3);
		meStudents.add(s4);
		
		// Civil
		List<Students> civilStudents = new ArrayList<Students>();
		civilStudents.add(s5);
		
		Department cse = new Department("CSE", cseStudents);
		Department me = new Department("ME", meStudents);
		Department civil = new Department("Civil", civilStudents);
		
		List<Department> departments = new ArrayList<Department>();
		departments.add(cse);
		departments.add(me);
		departments.add(civil);
		
		Institute institute = new Institute("KUK", departments);
		int noOfStudents = institute.getTotalStudentsOfAllDept();
		System.out.println("Total no of students are : " + noOfStudents);
	}
}

// When do we use Aggregation ??
// Code reuse is best achieved by aggregation.


