package Logical_Exercise_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumProductMinMax3_5_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Integer: ");
		int firstNumber = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int secondNumber = sc.nextInt();
		System.out.println("Enter third Number: ");
		int thirdNumber = sc.nextInt();
		int sum = firstNumber + secondNumber + thirdNumber;
		int product = firstNumber * secondNumber *thirdNumber;
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " + product);
		int max = firstNumber > secondNumber ? (firstNumber> thirdNumber ? firstNumber :thirdNumber):(secondNumber> thirdNumber ? secondNumber :thirdNumber);
		int min = firstNumber > secondNumber ? (secondNumber > thirdNumber ? thirdNumber :secondNumber):(firstNumber> thirdNumber ? thirdNumber :firstNumber);
		System.out.println("The min is: " + min);
		System.out.println("The max is: " + max);

		System.out.println("============sum ProductMinMax5============");
		//========================sum ProductMinMax5===================
		List<Integer>  list = new ArrayList<>();
		for(int i =1;i<=5;i++) {
			System.out.println("Enter " + i + " Number");
			list.add(sc.nextInt());
		}
		sum = list.stream().collect(Collectors.summingInt(Integer :: intValue));
		product = list.stream()
				  .reduce(1, (subtotal, element) -> subtotal*element);
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " + product);

		min = list.stream().min((a,b)->a-b).get();
		max = list.stream().max((a,b)->a-b).get();
		
		System.out.println("The min is: " + min);
		System.out.println("The max is: " + max);

		sc.close();
	}
}
