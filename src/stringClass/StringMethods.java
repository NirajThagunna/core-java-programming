package stringClass;

import java.io.PrintWriter;
import java.io.StringWriter;

// In java String is an object. 
// String is a sequence of the characters.
// String is a sequence of a characters.
// String objects are immutable i.e. it is constant and cannot be changed once created.

// Different methods of String objects

public class StringMethods {
	
	public static void main(String[] args) {
		
		try {
			// Creating a String using String literal
			String str = "Niraj Thagunna";
			
			// 1. length() - In String length is a function length()
			System.out.println("Length : " + str.length());
			
			// 2. CharAt(index)
			System.out.println("Character at index : " + str.charAt(2));
			
			// 3. subString(index) - returns the strings from the index
			System.out.println("Sub-String : " + str.substring(2));
			
			// 4. substring(i, j) - start from i to j - 1
			System.out.println("Sub-String : " + str.substring(2, 5));
			
			// 5. concat()
			String str1 = "Niraj";
			String str2 = "Thagunna";
			System.out.println(str1.concat(str2));
			
			// + for concat
			System.out.println(str1 +" "+ str2);
			
			// 6. indexOf(String str) - 
			String str3 = "I love JavaScript Java";
			System.out.println(str3.indexOf("Java"));
			
			// 7. indexOf(String str, int i)
			System.out.println(str3.indexOf("va", 4));
			
			// 8. lastIndexOf(String str)
			System.out.println(str3.lastIndexOf("va"));
			
			// 9. equals()
			String str4 = "Niraj";
			String str5 = "Niraj";
			System.out.println(str4.equals(str5));
			
			// 10. equalsIgnoreCase()
			System.out.println("Niraj".equalsIgnoreCase("niraj"));
			
			// 11. compareTo()
			System.out.println("Niaj".compareTo("Thagunna"));
			
			System.out.println("Niraj".toLowerCase());
			
			System.out.println("niraJ".toUpperCase());
			
			// 12. String trim()
			// Returns a copy of the string, by removing the white spaces from both the ends start and end
			// It does not affects the white spaces at the middle
			String str6 = "    Love the    way Okay   ";
			System.out.println(str6.trim());
			
			
			// 13. replace() 
			String s1 = "Niraj Thagunna";
			String s2 = s1.replace("aj", "u");
			System.out.println(s2);
			System.out.println(s1);
			
			
			// 14. subSequence(i, j) - returns a sub-string starts from i to j - 1
			String s = "Geeksforgeeks";
			System.out.println(s.subSequence(8, 12)); 
			
			// 15. boolean contains(String str)
			// It returns true if the given CharSquence is present in the String on which its invoked.
			System.out.println(s.contains("geek"));
			
			// 16. contentEquals(String str)
			// It returns true only if the given CharSequence exactly matches the String on which its invoked.
			String s3= "I learn JS";
			System.out.println(s3.contentEquals("I learn JS"));
		}
		catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
	}
}













