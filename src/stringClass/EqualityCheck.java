package stringClass;

public class EqualityCheck {
	
	public static void main(String[] args) {
		
		// String literal
		String str1 = "Niraj";
		String str2 = "Niraj";
		
		if (str1 == str2) {
			System.out.println("First Equal!");
		}
		
		// Creating a String using new keyword
		String str3 = new String("Niraj");
		
		if (str1 == str3) {
			System.out.println("Second Equality!");
		}
		
		String str4 = new String("Niraj");
		
		if (str3 == str4) {
			System.out.println("Third Equality!");
		}
		
		if (str1.equals(str3)) {
			System.out.println("One Step");
		}
		
		if (str3.equals(str4)) {
			System.out.println("Closer....");
		}
	}
}
