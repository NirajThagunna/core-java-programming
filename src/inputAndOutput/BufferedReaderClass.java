package inputAndOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// split() method to read multiple inputs at a single line
public class BufferedReaderClass {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Reading...");
		
		String[] nums = reader.readLine().split(" ");
		
		int sum = 0;
		for (String item: nums) {
			sum += Integer.parseInt(item);
		}
		
		System.out.println("Sum : " + sum);
	}
}
