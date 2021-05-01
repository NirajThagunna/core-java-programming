package inputAndOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Java program illustrating the Byte stream to copy the contents of one file to another file

public class ByteStream {

	public static void main(String[] args) throws IOException {
		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;
		
		try {
			sourceStream = new FileInputStream("F:/core_java/core_java_programming/src/files/sourceFile.txt");
			targetStream = new FileOutputStream("F:/core_java/core_java_programming/src/files/targetFile.txt");
			
			// Reading the source file and writing the contents into the target file byte by byte
			int temp;
			while ((temp = sourceStream.read()) != -1) {
				targetStream.write((byte) temp); // write() method is used write the specified byte to the file output stream
			}
			System.out.println("Successfully write data into the target file...");
		}
		finally {
			if (sourceStream != null)
				sourceStream.close();
			if (targetStream != null)
				targetStream.close();
		}
	}
}
