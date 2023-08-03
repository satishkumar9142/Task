package Logical_Exercise_14;

public class Linear_Search_14_1 {
	
	public static boolean linearSearch(int[] array, int key) {
		for(int i =0;i<array.length;i++) {
			if(array[i] == key) {
				return true;
			}
		}
		return false;
	}
	public static int linearSearchIndex(int[] array, int key) {
		for(int i =0;i<array.length;i++) {
			if(array[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,7,8,9,10,11,12,13};
		System.out.println(linearSearch(arr, 6));
		System.out.println(linearSearchIndex(arr, 12));
	}
}
