package coreJava;

import java.util.Scanner;

public class TotalSalary {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int basic = scan.nextInt();
		String str = scan.next();
		char grade = str.charAt(0);
		
		double hra = 0.2 * basic;
		double da = 0.5 * basic;
		double pf = 0.11 * basic;
		
		int allow = 0;
		if (grade >= 65 && grade <= 90) {
			if (grade == 65)
				allow = 1700;
			else if (grade == 66)
				allow = 1500;
			else if (grade == 67 || grade <= 90)
				allow = 1300;
		}
		
		double totalSalary = basic + hra + da + allow - pf;
		System.out.println(Math.round(totalSalary));
		
		scan.close();
	}
}
