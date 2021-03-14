package inputAndOutput;

import java.io.FileReader;
import java.io.IOException;

// Read a file in a human readable format using FileReader
public class CharacterStream {
	
	public static void main(String[] args) {
		
		// FileReader
		FileReader sourceStream = null;
		try {
			sourceStream = new FileReader("test.txt");
			
			// Reading source file and writing content to target file character by character
			int temp;
			while ((temp = sourceStream.read()) != -1) {
				System.out.println((char)temp);
			}
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			if (sourceStream != null) {
				try {
					sourceStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
