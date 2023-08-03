package Logical_Exercise_10;

import java.util.Arrays;

public class copyOf_10_9 {
	public static int[] copyOf(int[] array) {
		return array;	
	}
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7,8,9};
		int [] copyArray = copyOf(array);
		System.out.println(Arrays.toString(copyArray));
		System.out.println(Arrays.toString(array));
	}
	
}
