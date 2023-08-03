package Logical_Exercise_9;

import java.util.Scanner;

public class Dec2Hex_9_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int decimalNumber = sc.nextInt();
		String Dec2hex = Integer.toHexString(decimalNumber).toUpperCase();
		System.out.println("The equivalent hexadecimal number is :"+ Dec2hex);
		
		sc.close();
	}
}
