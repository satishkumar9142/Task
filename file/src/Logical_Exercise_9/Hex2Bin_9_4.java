package Logical_Exercise_9;

import java.util.Scanner;

public class Hex2Bin_9_4 {
	public static void main(String[] args) {
	 	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Hexadecimal string: ");
		String Hexadecimal = sc.next();
		
		System.out.print("The equivalent binary for hexadecimal "+Hexadecimal+ " is:");
		
		for(int index =0;index<Hexadecimal.length();index++) {
			int decimal = Integer.parseInt(""+Hexadecimal.charAt(index), 16);
			String binary = Integer.toBinaryString(decimal);
			
			System.out.print(binary + " ");
		}
		
		sc.close();
	}
}
