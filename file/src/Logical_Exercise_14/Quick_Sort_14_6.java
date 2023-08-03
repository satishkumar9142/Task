package Logical_Exercise_14;

import java.util.Arrays;

public class Quick_Sort_14_6 {
	public static void QuickSort(int [] arr, int low, int high) {
		
		if(low < high) {
			int pidx = partion(arr, low, high);
			 QuickSort(arr, low, pidx-1);
			 QuickSort(arr, pidx+1, high);
		}
	}
	
	public static int partion(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low -1;
		
		for(int j =low;j<high;j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;
	}
	public static void main(String[] args) {
		int [] arr = {6,7,8,5,4,3,9,5,3};
		System.out.println(Arrays.toString(arr));
		QuickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
