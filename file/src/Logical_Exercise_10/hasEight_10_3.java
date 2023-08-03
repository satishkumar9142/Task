package Logical_Exercise_10;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class hasEight_10_3 {
	public static void main(String[] args) {
		final int SENTINEL = -1; 
		int number;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer (or -1 to end): ");
		number = sc.nextInt();

		BiFunction<Integer, Integer, Integer> fn = (a,b)->a+b;
		while(number != SENTINEL) {
			if(hasEight(number)) {
				sum = fn.apply(number, sum);
			}
			System.out.print("Enter a positive integer (or -1 to end): ");
			number = sc.nextInt();
		}
		System.out.println("The magic sum is : "+ sum);
		sc.close();
	}
	public static boolean hasEight(int number) {
		Predicate<Integer> pre = i->i==8;
		while(number > 0) {
			if(pre.test(number%10)){
				return true;
			}
			number /=10;
		}
		return false;
	}
}
