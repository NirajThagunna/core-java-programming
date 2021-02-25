package oops;

// same method name but different parameters
// you can change the return type of methods
public class CompileTimePolymorphism {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public float add(float a, float b, float c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		CompileTimePolymorphism obj = new CompileTimePolymorphism();
		
		System.out.println(obj.add(5, 5));
		System.out.println(obj.add(5.5f, 5.5f, 5.5f));
	}
}
