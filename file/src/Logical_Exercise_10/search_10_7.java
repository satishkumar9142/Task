package Logical_Exercise_10;

import java.util.function.Predicate;

public class search_10_7 {
	public static int search(int[] array, int key) {
		Predicate<Integer> pre = i->i== key;
		for(int index=0;index<array.length;index++) {
			if(pre.test(array[index])) {
				return index;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] array = {1,3,5,7,8,9,66,5,3,2,2};
		int key = 3;
		System.out.println("Is Array Contains "+key+ " : " + search(array, key));
	}
}
