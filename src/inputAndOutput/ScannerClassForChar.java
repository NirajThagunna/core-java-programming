package inputAndOutput;

import java.util.Scanner;

// Scanner and nextChar() in Java
// Scanner class supports nextInt(), nextDouble(), nextLine() -> for strings etc... But it does not support for character
// does not support nextChar()

// To read char we use next().charAt(0)
// next() function returns the next token/word in the input as a string and charAt(0) function returns the first character
// in that string.

// Java Program to read character by using Scanner class
public class ScannerClassForChar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Character input
		char c = scan.next().charAt(0);
		
		// Print the read value
		System.out.println("Character is : " + c);
		
		scan.close();
	}
}
