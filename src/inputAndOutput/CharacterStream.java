package inputAndOutput;

import java.io.FileReader;
import java.io.IOException;

// Java program illustrating that we can read a file in a human readable format using FileReader

public class CharacterStream {
	
	public static void main(String[] args) throws IOException {
		
		// Creating an object for the FileReader class
		FileReader sourseStream = null;
		
		try {
			sourseStream = new FileReader("F:/core_java/core_java_programming/src/files/test.txt");
			
			// Reading the source file and writing the content into the target file character by character
			int temp;
			
			// read() method is used to return a character in ASCII form. It returns -1 at the end of the file.
			while ((temp = sourseStream.read()) != -1) {
				System.out.print((char) temp);
			}
		}
		finally {
			// Closing the stream as no longer in use
			if (sourseStream != null)
				sourseStream.close();
		}
	}
}
