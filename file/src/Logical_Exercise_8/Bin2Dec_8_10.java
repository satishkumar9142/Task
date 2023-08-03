package Logical_Exercise_8;

import java.util.Scanner;
import java.util.function.Predicate;

public class Bin2Dec_8_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inStr = sc.next();
		char inChar;
		boolean isValid = true;
		Predicate<Character> pre = i-> (i=='0'||i=='1');
		for(int index =0;index<inStr.length();index++) {
			inChar  = inStr.charAt(index);
			if(!(pre.test(inChar))) {
				isValid = false;
				break;
			}
		}
		int number =0;
		if(isValid) {
			for(int index = inStr.length()-1;index>=0;index--) {
			number += Math.pow(2, (inStr.length()-1-index))*(inStr.charAt(index)-'0');
			}
		}else{
			System.out.println("error: invalid binary string " + inStr);
			sc.close();
			return;
		}
		System.out.println("The equivalent decimal number for binary "+inStr+ " is : " + number);
		sc.close();
	}
}
