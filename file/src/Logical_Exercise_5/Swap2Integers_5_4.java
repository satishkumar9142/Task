package Logical_Exercise_5;

import java.util.Scanner;

public class Swap2Integers_5_4 {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter first Number");
	 int firstNumber = sc.nextInt();
	 System.out.println("Enter Second Number");
	 int secondNumber = sc.nextInt();
	 
	 int  temp = firstNumber;
	 firstNumber = secondNumber;
	 secondNumber = temp;
	 
	 System.out.println("first Number: " + firstNumber);
	 System.out.println("Second Number: " + secondNumber );
	
	 
	 sc.close();
	}
}
