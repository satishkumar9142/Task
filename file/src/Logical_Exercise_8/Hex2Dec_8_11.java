package Logical_Exercise_8;

import java.util.Scanner;

public class Hex2Dec_8_11 {
	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter a Hexadecimal string: ");
	 	int result = 0;
	 	String Hex2Dec = sc.next();
	 	try {
	 		result = Integer.parseInt(Hex2Dec,16);
	 	}
	 	catch(NumberFormatException e) {
	 		System.out.println("error: invalid hexadecimal string  " +  Hex2Dec);
	 		sc.close();
	 		return;
	 	}
	 	
	 	System.out.println("The equivalent decimal number for hexadecimal" + Hex2Dec + " is: " +  result);
	 	
	 	sc.close();
	}
}
