package Logical_Exercise_5;

import java.util.Scanner;

public class InputValidation_5_12 {
	public static void main(String[] args) {

		int numberIn;     
		boolean isValid = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter a number between 0 -10 or 90 - 100");
			numberIn = sc.nextInt();
			if((numberIn < 10 && numberIn > 0) || (numberIn > 90 && numberIn < 100)) {
				System.out.println("You have entered: " + numberIn);
				isValid = true;
			}
			else {
				System.out.println("Invalid input, try again...");
				isValid = false;
			}
		}
		while(!isValid);

		sc.close();
	}
}
