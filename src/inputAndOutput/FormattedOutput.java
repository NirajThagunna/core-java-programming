package inputAndOutput;

// 1. Formatted output using System.out.printf()
// 2. System.out.printf() is equivalent to System.out.format()
public class FormattedOutput {
	
	public static void main(String[] args) {
		
		float x = 10.346376534f;
		
		System.out.printf("After decimal precison : %.2f\n", x);
		
		x = 2.0f;
		System.out.printf("Width : %.3f\n", x);
		
		// formatted from right margin
		x = 10.7634687365398748f;
		System.out.format("Formatted from right margin : %20.4f\n", x);
	}
}
