package Logical_Exercise_8;

import java.util.Scanner;

public class Oct2Dec_8_12 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter a Octal string: ");
	 	String octal = sc.next();
	 	int oct2Dec = Integer.parseInt(octal, 8);
	 	System.out.println("The equivalent decimal number "+ octal + " is: " +oct2Dec);
	 	
	 	
	 	sc.close();
	}
}
