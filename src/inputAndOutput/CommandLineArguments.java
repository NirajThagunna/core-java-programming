package inputAndOutput;

// Passing the arguments into the main method

public class CommandLineArguments {
	public static void main(String[] args) {
		
		int length = args.length;
		System.out.println("Length : " + length);
		
		for (String value: args) {
			System.out.println(value);
		}
	}
}
