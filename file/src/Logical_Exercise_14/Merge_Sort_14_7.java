package Logical_Exercise_14;

import java.util.Arrays;

public class Merge_Sort_14_7 {
	
	public static void mergeSort(int [] arr, int start, int end) {
		if(start >= end) 
			return;
		
		int mid = start + (end-start)/2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid+1, end);
		merge(arr, start, mid, end);
		
	}
	public static void merge(int[] arr, int start, int mid, int end) {
		int [] temp = new int[end -start+1];
		int i = start;
		int j = mid+1;
		int k =0;
		
		while(i<= mid && j <= end) {
			if(arr[i] > arr[j])
				temp[k++] = arr[j++];
			else
				temp[k++] = arr[i++];
		}
		while(i <= mid)
		temp[k++] = arr[i++];
		while(j <= end)
		temp[k++] = arr[j++];
		
		for(k=0,i =start;k<temp.length;k++,i++)
		arr[i] = temp[k];
	}
	public static void main(String[] args) {
		int [] arr = {9, 2, 4, 1, 5};
		System.out.println(Arrays.toString(arr));
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
