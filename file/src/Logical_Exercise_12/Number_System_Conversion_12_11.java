package Logical_Exercise_12;

import java.util.Scanner;

public class Number_System_Conversion_12_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number and radix: ");
		String in = sc.next();
		System.out.println("Enter the input radix: ");
		int inRadix = sc.nextInt();
		System.out.println("Enter the output radix: ");
		int outRadix = sc.nextInt();
		System.out.println(toRadix(in, inRadix, outRadix));
		
		sc.close();
	}
	public static String toRadix(String in, int inRadix, int outRadix) {
		int radix  = Integer.parseInt(in, inRadix);
		String binaryString = Integer.toBinaryString(radix);
		
		return in + " in radix " + inRadix +" is " + binaryString +" in radix " + outRadix;	
	}
}
