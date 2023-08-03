package Logical_Exercise_5;

import java.util.Scanner;

public class ReverseInt_5_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int PosInteger = sc.nextInt();
		int rev = 0;
		while(PosInteger > 0) {
			rev = 10*rev + PosInteger%10;
			PosInteger /= 10;
		}
		System.out.println("The reverse is: " + rev);
		
		sc.close();
	}
}
