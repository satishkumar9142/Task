package Logical_Exercise_13;

import java.util.Scanner;

public class Length_of_a_Running_Number_Sequence_13_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		String s = lengthOfNumberSequence(n);
		System.out.println("S("+n+") = " + s);
		
		sc.close();
	}
// Iterative Solution	
	public static String lengthOfNumberSequence(int n) {
		String number = "";
		for(int num =1;num<=n;num++) {
			number += num;
		}
		return number +"   length is " + number.length();
	}
//    recursion method
//	public static int lengthOfNumberSequencerecursion(int n)
//	{
//		if(n ==0) {
//			return 0;
//		}
//		return 1;
//	}
}
