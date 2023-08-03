package Logical_Exercise_10;

import java.util.function.BiPredicate;

public class equals_10_8 {
	
	public static boolean equals(int[] array1, int[] array2) {
		BiPredicate<Integer, Integer> pre = (a,b)->a==b;

		if(pre.test(array1.length, array2.length)) {
			for(int i =0;i<array1.length;i++) {
				if(!pre.test(array1[i], array2[i])) {
					return false;
				}
			}
		}
		else {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int [] array1 = {1,2,3,5,5,6,7,8};
		int [] array2 = {1,2,3,4,5,6,7,8};
		System.out.println("Both array are equal ? :- " + equals(array1, array2));
	}
	
}
