package Logical_Exercise_6;

import java.util.Scanner;

public class HillPattern_6_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size = sc.nextInt();

//================(a)==================================
		System.out.println("=================(a)=====================");
		for(int row =0;row <= size;row++) {
			for(int col = 1;col < 2*size;col++) {
				System.out.print((row + col >= size + 1) && (row >= col - size + 1)? "# " :"  ");
			}
			System.out.println();
		}
//================(b)==================================
		System.out.println("=================(b)=====================");
		for(int row =size;row >= 1;row--) {
			for(int col = 1;col < 2*size;col++) {
				System.out.print((row + col >= size + 1) && (row >= col - size + 1)? "# " :"  ");
			}
			System.out.println();
		}
		
// ================(c)==================================
		System.out.println("=================(c)=====================");
		for(int row =0;row <= size;row++) {
			for(int col = 1;col < 2*size;col++) {
				System.out.print((row + col >= size + 1) && (row >= col - size + 1)? "# " :"  ");
			}
			System.out.println();
		}
		for(int row =size-1;row >= 1;row--) {
			for(int col = 1;col < 2*size-1;col++) {
				System.out.print((row + col >= size + 1) && (row >= col - size + 1)? "# " :"  ");
			}
			System.out.println();
		}
// ================(d)===================================
		System.out.println("=================(d)=====================");
		for(int row =size;row >= 1;row--) {
			for(int col = 1;col <= size;col++) {
				System.out.print(row >=col ? "# ":"  ");
			}
			for(int col = size+1;col< 2*size;col++) {
				System.out.print(2*size-row <= col ? "# " :"  ");
			}
			System.out.println();
		}
		for(int row =1;row <= size;row++) {
			for(int col = 1;col <= size;col++) {
				System.out.print(row >=col ? "# ":"  ");
			}
			for(int col = size+1;col< 2*size;col++) {
				System.out.print(2*size-row <= col ? "# " :"  ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
