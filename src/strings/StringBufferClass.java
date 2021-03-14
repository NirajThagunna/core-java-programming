package strings;

// StringBuffer class
public class StringBufferClass {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Niraj Thagunna");
		int l = str.length();
		int c = str.capacity();
		System.out.println("Length : " + l);
		System.out.println("Capacity : " + c);
		
		// append
		str.append(" Engineer");
		System.out.println(str);
		str.append(1);
		System.out.println(str);
		
		// insert
		str.insert(2, "d");
		System.out.println(str);
		str.insert(2, 10);
		System.out.println(str);
		
		char[] chars = {'L', 'O', 'V', 'E'};
		str.insert(5, chars);
		System.out.println(str);
		
		// reverse
		str.reverse();
		System.out.println(str);
		
		// delete
		str.delete(1, 10);
		System.out.println(str);
		str.deleteCharAt(5);
		System.out.println(str);
	}
}
