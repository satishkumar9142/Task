package Logical_Exercise_12;

import java.util.ArrayList;
import java.util.List;

public class Print_Triangles_12_5 {
	public static void main(String[] args) {
		printPowerOf2Triangle(8);
		printPascalTriangle1(7);
		printPascalTriangle2(7);
		
	}

	public static void printPascalTriangle1(int size) {
		System.out.println("===I am inside printPascalTriangle1===== ");
		int output=1;  
		for(int row = 0; row < size; row++) {  
			for(int col = 0; col <= row; col++) {   
				output = col ==0|| row ==0 ? 1 :output * (row - col + 1) / col; 
				System.out.printf("%3d",output); 
			}  
			System.out.println();  
		}     
	}  

	public static void printPascalTriangle2(int size) {
		System.out.println("===I am inside printPascalTriangle2===== ");
		int output=1;  
		for(int row = 0; row < size; row++) {  
			for(int space = 1; space < size - row; space++) {  
				System.out.print("  ");  
			} 
			for(int col = 0; col <= row; col++) {  
				output = col == 0|| row == 0 ? 1 :output * (row - col + 1) / col;
				System.out.printf("%4d",output);  
			}  
			System.out.println();  
		}     
	} 
	public static void printPowerOf2Triangle(int size) {
		System.out.println("===I am inside printPowerOf2Triangle===== ");
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		List<Integer> list2 = new ArrayList<>();
		if(size>=2) {
			for(int space =0;space<size-1;space++) {
				System.out.print("    ");
			}
			System.out.println(""+list1.get(0));
		}
		for(int row =1;row <= size-1;row++) {
			for(int space = 0;space<size-row-1;space++) {
				System.out.print("    ");
			}
			System.out.print(1);
			list2.add(1);
			for(int col = 0;col<list1.size();col++) {
				System.out.printf("%4d",2*list1.get(col));
				list2.add((2*list1.get(col)));
			}
			System.out.printf("%4d%n",1);
			list2.add(1);
			list1.clear();
			list1.addAll(list2);
			list2.clear();
		}
	}

}
