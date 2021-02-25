package oops;

// Initializer block contains the code that is always executed whenever an instance is created. 
// It is used to declare/initialize the common part of various constructors of a class.
public class InitializerBlock {
	
	{
		System.out.println("Coomon part of constructor invoked !!!");
	}
	
	public InitializerBlock() {
		System.out.println("I am a default constructor!");
	}
	
	public InitializerBlock(String name) {
		System.out.println("I am a parameterized constructor with value " + name);
	}
	
	public static void main(String[] args) {
		InitializerBlock obj1 = new InitializerBlock();
		InitializerBlock obj = new InitializerBlock("Okay!");
	}
}
