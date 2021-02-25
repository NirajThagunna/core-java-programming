package oops;

// if we want to execute some code once for all objects of a class
public class StaticBlock {
	
	private static int i;
	int j;
	
	static {
		i = 20;
		System.out.println("Static block is called!");
	}
	
	public static void main(String[] args) {
		System.out.println(i);
	}
}
