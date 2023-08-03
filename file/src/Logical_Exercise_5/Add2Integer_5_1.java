package Logical_Exercise_5;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Add2Integer_5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Integer: ");
		int firstnumber = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int secondnumber = sc.nextInt();
		int sum = firstnumber + secondnumber;
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("The Sum is: "+add.apply(firstnumber, secondnumber));
		System.out.println("The sum is: " + sum);
		sc.close();
	}
}
