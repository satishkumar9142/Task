package Logical_Exercise_5;

import java.util.Scanner;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class AverageWithInputValidation_5_13 {
	public static void main(String[] args) {

		final int NUM_STUDENTS = 3;

		int numberIn;
		boolean isValid;
		int sum = 0;
		double average;
		
		Scanner sc = new Scanner(System.in);
		
		for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
			isValid = false;
			
			do {
				System.out.println("Enter the mark (0-100) for student " + studentNo + " :");
				numberIn = sc.nextInt();
				Predicate<Integer> pre = i-> i>=0 && i<=100; // predicate
				if(pre.test(numberIn)) {
					System.out.println("Enter the mark (0-100) for student " + studentNo+ ": " + numberIn);
					isValid = true;
				}
				else {
					System.out.println("Invalid input, try again...");
					isValid = false;
				}
			}while(!isValid);
			sum += numberIn;
		}
		BiFunction<Double, Double, Double>  fn = (a,b) -> a/b;
		average = fn.apply((double)sum, (double)NUM_STUDENTS);
		System.out.printf("The average is : %.2f",average);
	
	sc.close();
	}
}
