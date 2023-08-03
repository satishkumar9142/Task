package Logical_Exercise_10;

import java.util.Scanner;
import java.util.function.BiFunction;

public class exponent_10_1 {
	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter the base: ");
	 	int base = sc.nextInt();
	 	System.out.println("Enter the exponent: ");
	 	int exp = sc.nextInt();
	 	System.out.println(base +" raises to the power of "+exp +" is : " + exponent(base,exp));
	 		
	 	sc.close();
	}
	public static double exponent(int base, int exp) {
		BiFunction<Integer, Integer, Double> fn =(a,b)->Math.pow((double)a, (double)b);
		return fn.apply(base, exp);
	}
}