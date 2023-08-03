package Logical_Exercise_14;

import java.util.Arrays;

public class Insertion_Sort_14_5 {
	
	public static void insertionSort(int[] array) {
		for (int i = 1;i<array.length;i++)
		{
			int curr = array[i];
			int prev = i-1;
			while(prev >= 0 && array[prev] > curr)
			{
				array[prev +1] = array[prev];
				prev--;
			}
			array[prev +1] = curr;
		}
	}
	public static void main(String[] args) {
		int [] arr = {9, 6, 4, 1, 5, 2, 7};
		System.out.println("Initial array" + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("final array" + Arrays.toString(arr));
	}
}
