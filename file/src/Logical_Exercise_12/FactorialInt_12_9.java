package Logical_Exercise_12;

import java.util.Scanner;

public class FactorialInt_12_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int fac = fac(num, 1);
		if(num > -13 && fac < 13)
 	 	System.out.println("The factorial of "+ num +" is " +fac);
		else {
	 	 	System.out.println("The factorial of "+ num +" is out of range ");
		}
 	 	sc.close();
	}
	
	public static int fac(int x, int cal) {
		if(x ==1) {
			return cal;
		}
		cal *= x;
		return fac(x-1, cal);
		
	}
}
