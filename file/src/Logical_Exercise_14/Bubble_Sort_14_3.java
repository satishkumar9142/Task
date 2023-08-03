package Logical_Exercise_14;

import java.util.Arrays;

public class Bubble_Sort_14_3 {

	public static void bubbleSort1(int[] array) {
		for(int i =0;i<array.length;i++) {
			for(int j =0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp; 
				}
			}
		}
	}
	
	public static void bubbleSort2(int[] array) {
		int n = array.length;
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < n; ++i) {
				if( array[i-1] > array[i]) {
					int temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
					swapped = true;  
				}
			}
			n = n - 1;
		} while (swapped);
	}
	public static void main(String[] args) {
		int [] arr = {9, 2, 4, 1, 5};
		System.out.println(Arrays.toString(arr));
//		bubbleSort1(arr);
//		System.out.println(Arrays.toString(arr));
		bubbleSort2(arr);
		System.out.println(Arrays.toString(arr));
	}
}
