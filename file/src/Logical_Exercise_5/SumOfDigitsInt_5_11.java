package Logical_Exercise_5;

import java.util.Scanner;

public class SumOfDigitsInt_5_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int PosInteger = sc.nextInt();
		int sum = 0;
		while(PosInteger > 0) {
			sum += PosInteger%10;
			PosInteger /= 10;
		}
		System.out.println("The sum of all digits is: " + sum);
		
		sc.close();
	}
}
