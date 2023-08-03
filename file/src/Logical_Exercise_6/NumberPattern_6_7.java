package Logical_Exercise_6;

import java.util.Scanner;

public class NumberPattern_6_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size = sc.nextInt();

//================(a)==================================
		System.out.println("=================(a)=====================");
		for(int row =1;row <= size;row++) {
			for(int col = 1;col <=size;col++) {
			System.out.print(row >= col ? col+ " ": "");
			}
			System.out.println();
		}
//================(b)==================================
		System.out.println("=================(b)=====================");
		for(int row =1;row <= size;row++) {
			for(int col = 1;col <=size;col++) {
				System.out.print(row <= col ? col-row+1+ " ": "  ");
			}
			System.out.println();
		}
//================(c)==================================
		System.out.println("=================(c)=====================");
		for(int row =size;row >= 1;row--) {
			for(int col = 1;col <=size;col++) {
				System.out.print(row <= col ? size-col+1+ " ": "  ");
			}
			System.out.println();
		}
//================(d)==================================
		System.out.println("=================(d)=====================");
		for(int row =size;row >= 1;row--) {
			for(int col = row;col >=1;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
