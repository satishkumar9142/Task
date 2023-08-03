package Logical_Exercise_8;

import java.util.Scanner;

public class RadixN2Dec_8_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter a radix: ");
	 	int decimal = 0;
	 	int radix = sc.nextInt();
	 	System.out.println("Enter a string: ");
	 	String radixDe = sc.next();
	 	try {
	 		decimal = Integer.parseInt(radixDe,radix);
	 	}
	 	catch(NumberFormatException e) {
	 		System.out.println("error: invalid hexadecimal string  " +  radixDe);
	 		sc.close();
	 		return;
	 	}
	 	
	 	System.out.println("The equivalent decimal number "  + " is: " +  decimal);
	 	
	 	sc.close();
	}
}
