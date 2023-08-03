package Logical_Exercise_10;

import java.util.Arrays;

public class swap10_10 {
	public static void main(String[] args) {
		int [] array1 = {10,20,30,40,50,60,70};
		int [] array2 = {80,90,100,120,130,140,150};
		System.out.println("Array1 := " +Arrays.toString(array1));
		System.out.println("Array2 := " +Arrays.toString(array2));
		
		if(swap(array1, array2)) {
			System.out.println("Array1 := " +Arrays.toString(array1));
			System.out.println("Array2 := " +Arrays.toString(array2));
		}
		else {
			System.out.println("Can swap the array length are different");
		}
	}
	public static boolean swap(int[] array1, int[] array2) {
		if(array1.length == array2.length) {
			for(int index =0;index<array1.length;index++) {
				int temp = array1[index];
				array1[index] = array2[index];
				array2[index] = temp;
			}
		}
		else
			return false;
		return true;
	}  
}
