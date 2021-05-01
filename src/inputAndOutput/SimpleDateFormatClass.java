package inputAndOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Formating dates and parsing using SimpleDateFormat class

public class SimpleDateFormatClass {
	
	public static void main(String[] args) throws ParseException {
		
		// formatting dates as per given patterns
		SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
		
		String str = df.format(new Date());
		System.out.println("Formatted Date : " + str);
		
		// Parsing a given String
		str = "02/18/1995";
		df = new SimpleDateFormat("mm/dd/yyyy");
		Date date = df.parse(str);
		
		// this will print the date as per parsed String
		System.out.println(date);
	}
}
