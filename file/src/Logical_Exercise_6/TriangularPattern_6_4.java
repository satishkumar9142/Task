package Logical_Exercise_6;

import java.util.Scanner;

public class TriangularPattern_6_4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = sc.nextInt();
		
// =====================(a)=====================	
		System.out.println("============(a)================");
		for(int row = 1;row <=size;row++) {
			for(int col = 1;col <= row;col++) {
				System.out.print("# ");
			}
			System.out.println();
		}
// =====================(b)=====================	
		System.out.println("============(b)================");
		for(int row = size;row >=1;row--) {
			for(int col = 1;col <= row;col++) {
				System.out.print("# ");
			}
			System.out.println();
		}
// =====================(c)=====================	
		System.out.println("============(c)================");
		for(int row = 1;row <=size;row++) {
			for(int col = 1;col <= size;col++) {
				System.out.print(col>=row ?"# ":"  ");
			}
			System.out.println();
		}
// =====================(d)=====================	
		System.out.println("============(d)================");
		for(int row = size;row >=1;row--) {
			for(int col = 1;col <= size;col++) {
				System.out.print(col>=row ?"# ":"  ");
			}
			System.out.println();
		}
sc.close();
	}
}
