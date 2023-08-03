package pack3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 670. Maximum Swap
Medium
3K
167
Companies
You are given an integer num. You can swap two digits at most once to get the maximum valued number.

Return the maximum valued number you can get.

Example 1:

Input: num = 2736
Output: 7236
Explanation: Swap the number 2 and the number 7.
Example 2:

Input: num = 9973
Output: 9973
Explanation: No swap.

 */

public class LeetCode1 {
	public static void main(String[] args) {

//		StringBuffer s1 = new StringBuffer();
		int num = 10;
		int count = 0;
		int n = num;
		while (n != 0) {
			count++;
			n /= 10;
		}

		int[] arr = new int[count];
		n = num;
		while (n != 0) {
			arr[count - 1] = n % 10;
			count--;
			n /= 10;
		}

		int index = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		Collections.sort(list, (a, b) -> b - a);
		System.out.println(list);
		int a = 0;
		int b = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != list.get(i)) {
				a = arr[i];
				b = list.get(i);
				index = i;
				break;
			}
		}
		int index1 = 0;
		for (int i = index; i < arr.length; i++) {
			if (arr[i] == b) {
				index1 = i;
				break;
			}
		}
		System.out.println(b + " " + index1);
		System.out.println(a + " " + index);
		int temp = arr[index1];
		arr[index1] = arr[index];
		arr[index] = temp;

		n = 0;
		for (int i = 0; i < arr.length; i++) {
			n = n * 10 + arr[i];
		}
		System.out.println(n);
	}
}
