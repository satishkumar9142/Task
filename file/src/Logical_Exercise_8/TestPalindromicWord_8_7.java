package Logical_Exercise_8;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class TestPalindromicWord_8_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String word = sc.next();
		int start =0;
		int end = word.length()-1;
		BiPredicate<Character, Character> pre = (a,b)-> a!=b;
		
		boolean flag = false;
		while(start <= end) {
			if(pre.test(word.charAt(start), word.charAt(end))) {
				flag = true;
				break;
			}
			start++;
			end--;
		}
		System.out.println(flag ? "Not palindrome": "Palindrome");
		
		sc.close();
	}
}
