package Logical_Exercise_6;

import java.util.Scanner;

public class SquarePattern_6_1 {
	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int size = sc.nextInt();
		
		for(int row =1;row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		sc.close();
	}
}
