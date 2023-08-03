package Logical_Exercise_6;

import java.util.Scanner;

public class CheckerPattern_6_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int size = sc.nextInt();

		for(int row =1;row <= size; row++) {
			if(row %2 ==0) 
				System.out.print(" ");
			for(int col = 1; col <= size; col++) {
				System.out.print("# ");
			}
			System.out.println();
		}

		sc.close();
	}
}
