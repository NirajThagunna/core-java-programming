package strings;

public class StringClass {
	public static void main(String[] args) {
		String str = "Niraj"; // literal method to create a string
		
		System.out.println(str);
		
		// Length
		System.out.println(str.length());
		
		// charAt()
		System.out.println(str.charAt(3));
		
		// concat
		String str1 = " Thagunna";
		System.out.println(str1);
		System.out.println(str.concat(str1));
		
		// case
		System.out.println(str.toLowerCase());
		
		// equals
		System.out.println(str.equals(str1));
		
		// ignore
		System.out.println("Niraj".equalsIgnoreCase("niraj"));
		
		// trim
		System.out.println(str1.trim());
		
		// by using new keyword to create a string
		String str2 = new String("Ohhh");
		System.out.println(str2);
	}
}
