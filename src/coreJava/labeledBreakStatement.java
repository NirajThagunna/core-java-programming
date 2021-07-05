package coreJava;

public class labeledBreakStatement {

	public static void main(String[] args) {
		
		boolean b = true;
		
		first: {
			
			second: {
				
				third: {
					System.out.println("Before the break statement");
					
					if (b)
						
						break second;
					
					System.out.println("This will not excecute");
				}
				System.out.println("This will not execute");
			}
			System.out.println("This is after the second block");
		}
	}
}
