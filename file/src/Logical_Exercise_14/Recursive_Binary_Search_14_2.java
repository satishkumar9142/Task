package Logical_Exercise_14;

public class Recursive_Binary_Search_14_2 {
	public static void main(String[] args) {
		int arr [] = {11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45};
		System.out.println(binarySearch(arr, 21, 0, arr.length-1));
	}
	public static  boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
		if(fromIdx > toIdx) {
			return false;
		}
		int mid = fromIdx + (toIdx-fromIdx)/2;
		if(array[mid] == key) 
			return true;
		else if(array[mid] > key) 
			toIdx = mid -1;
		else 
			fromIdx = mid+1;
		
	    return	binarySearch(array, key, fromIdx, toIdx); 
	}
}


