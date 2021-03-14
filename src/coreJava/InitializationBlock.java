package coreJava;

// Initialization Block
// 1. Static initialization block
// 2. Instance initialization block
public class InitializationBlock {
	
	// Static initialization block
	// Runs once (when the class is initialized)
	static {
		System.out.println("Hey, I am static block!");
	}
	
	// Instance Initialization block
	// Runs each time you instantiate an object
	{
		System.out.println("Hey, I am instance block!");
	}
	
	public InitializationBlock() {
		System.out.println("Hey, I am a Constructor!");
	}
	
	public static void main(String[] args) {
		new InitializationBlock();
		new InitializationBlock();
	}
}


// Instance initialization blocks are useful if you want to have some code run regardless of which constructor is used or 
// if you want to do some instance initialization for anonymous classes.

/*
 * Order of execution:
 * static initialization blocks of super classes
 * static initialization blocks of the class
 * instance initialization blocks of super classes
 * constructors of super classes
 * instance initialization blocks of the class
 * constructor of the class.
 */


// it seems that instance initializer block is firstly invoked but NO. 
// Instance initializer block is invoked at the time of object creation. 
// The java compiler copies the instance initializer block in the constructor after the first statement super(). 
// So firstly, constructor is invoked.

