package Logical_Exercise_14;

import java.util.Arrays;

public class Selection_Sort_14_4 {
	public static void main(String[] args) {
		int [] arr = {9, 2, 4, 1, 5};
		System.out.println("initial Array =" + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("after sorting Array =" + Arrays.toString(arr));

	}
	public static void selectionSort(int[] array) {
		for(int i=0;i<array.length;i++)
		{
			int min = array[i], minIndex=i;
			for(int j=i+1;j<array.length;j++)
			{ 
				if(min > array[j])
				{
					min = array[j];
					minIndex =j;
				}
			}
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}
}
