package Logical_Exercise_10;

import java.util.Scanner;
import java.util.function.Predicate;

public class isOdd_10_2 {
	public static boolean isOdd(int number) {
		Predicate<Integer> pre = i-> i%2 ==1;
		return pre.test(number);
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		System.out.println(isOdd(number)? number +" is an odd number" :number + " is an even number");
		
		sc.close();
	}
	
}
