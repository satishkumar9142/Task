package Logical_Exercise_8;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckHexStr_8_9 {
	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String word = sc.next();	
		Predicate<Character> pre = i->(i>='a'&&i<='f')||(i>='A'&&i<='F')||(i>='0'&&i<='9');
		boolean isValid = true;
		for(int index =0;index<word.length();index++) {
			if(!pre.test(word.charAt(index))) {
				isValid = false;
				break;
			}
		}
		System.out.println(isValid ? word + " is a hex string" :word + " is NOT a hex string");
		sc.close();

	}
}




