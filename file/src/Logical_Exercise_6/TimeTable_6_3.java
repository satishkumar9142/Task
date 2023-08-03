package Logical_Exercise_6;

import java.util.Scanner;

public class TimeTable_6_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int produ = 1;
		int size = sc.nextInt();

		System.out.print("   * |");
		for(int space =1;space<=size;space++) {
			System.out.printf("%4d", space);
		}
		System.out.println();
		for(int dash =1;dash<=4*size+6;dash++) {
			System.out.print("-");
		}
		System.out.println();
		
		for(int row =1;row <= size; row++) {
			System.out.printf("%4d |", row);
			for(int col = 1; col <= size; col++) {
				produ = row * col; 
				System.out.printf("%4d", produ);
			}
			System.out.println();
		}

		sc.close();
	}
}
