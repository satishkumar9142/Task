package Logical_Exercise_12;

import java.util.Scanner;

public class NumberGuess_12_12 {
	public static void main(String[] args) {
		final int SECRET_NUMBER = (int)(Math.random()*100);
		
		Scanner sc = new Scanner(System.in);
		int count = 1;
		System.out.println("Key in your guess: ");
		int number = sc.nextInt();
		while(number != SECRET_NUMBER) {
			if(SECRET_NUMBER < number) {
				count++;
				System.out.println("try lower");
				number = sc.nextInt();
			}else
			{
				count++;
				System.out.println("try higher");
				number = sc.nextInt();
			}
		}
		System.out.println("You got it in "+ count + " trials!");
		
		sc.close();
	} 
}
