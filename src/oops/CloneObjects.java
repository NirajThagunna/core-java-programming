package oops;

public class CloneObjects implements Cloneable{
	
	private int rollNo;
	private String name;
	
	public CloneObjects(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// clone() method
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) {
		try {
			CloneObjects obj1 = new CloneObjects(80, "Niraj Thagunna");
			CloneObjects obj2 = (CloneObjects)obj1.clone();
			
			System.out.println(obj1.getRollNo() + ", " + obj1.getName());
			System.out.println(obj2.getRollNo() + ", " + obj2.getName());
		} 
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
