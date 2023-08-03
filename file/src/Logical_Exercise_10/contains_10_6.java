package Logical_Exercise_10;

import java.util.function.Predicate;

public class contains_10_6 {
	
	public static boolean contains(int[] array, int key) {
		Predicate<Integer> pre = i->i== key;
		for(int number : array) {
			if(pre.test(number)) {
				return true;
			}
		}
		return false;
//		Arrays.stream(array).fil
	}
	
	public static void main(String[] args) {
		int [] array = {1,3,5,7,8,9,66,5,3,2,2};
		int key = 67;
		System.out.println("Is Array Contains "+key+ " : " + contains(array, key));
	}
}
