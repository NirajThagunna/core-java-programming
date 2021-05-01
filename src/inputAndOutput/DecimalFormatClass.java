package inputAndOutput;

import java.text.DecimalFormat;

// The java.text.DecimalFormat class is used for formatting numbers as per customized format and as per locale.
public class DecimalFormatClass {

	public static void main(String[] args) {
		
		double num = 123.456;
		
		// DecimalFormat Class
		DecimalFormat numberFormat;
		
		// prints only the numeric part of the floating point number
		numberFormat = new DecimalFormat("####");	
		System.out.println(numberFormat.format(num));
		
		// Print up to 2 decimal places
		numberFormat = new DecimalFormat("#.##");
		System.out.println(numberFormat.format(num));
		
		// Automatically appends zero to the right most part of the number
		numberFormat = new DecimalFormat("#.0000000");
		System.out.println(numberFormat.format(num));
		
		// Automatically appends zero to the left most of the number
		numberFormat = new DecimalFormat("00000.##");
		System.out.println(numberFormat.format(num));
		
		// formatting money in dollars
		double income = 167999.6374482;
		numberFormat = new DecimalFormat("###,###.##");
		System.out.println(numberFormat.format(income));
	}
}




