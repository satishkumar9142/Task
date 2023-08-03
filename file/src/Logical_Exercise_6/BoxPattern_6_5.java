package Logical_Exercise_6;

import java.util.Scanner;

public class BoxPattern_6_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size = sc.nextInt();
//================(a)==================================
		System.out.println("=================(a)=====================");
		for(int row =1;row <= size;row++) {
			for(int col = 1;col <= size;col++) {
				System.out.print((row ==1 || col==1 || row == size || col == size)? "# " :"  ");
			}
			System.out.println();
		}
//================(b)==================================
		System.out.println("=================(b)=====================");
		for(int row =1;row <= size;row++) {
			for(int col = 1;col <= size;col++) {
				System.out.print((row ==1 || col==row || row == size)? "# " :"  ");
			}
			System.out.println();
		}
//================(c)==================================
		System.out.println("=================(c)=====================");
		for(int row =size;row >= 1;row--) {
			for(int col = 1;col <= size;col++) {
				System.out.print((row ==1 || col==row || row == size)? "# " :"  ");
			}
			System.out.println();
		}
//================(d)==================================
		System.out.println("=================(d)=====================");
		for(int row =size;row >= 1;row--) {
			for(int col = 1;col <= size;col++) {
				System.out.print((row ==1|| size-row+1==col|| row == col || row == size)? "# " :"  ");
			}
			System.out.println();
		}
//================(e)==================================
		System.out.println("=================(e)=====================");
		for(int row =size;row >= 1;row--) {
			for(int col = 1;col <= size;col++) {
				System.out.print((col == 1|| col== size || row ==1|| size-row+1==col|| row == col || row == size)? "# " :"  ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
