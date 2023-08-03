package Logical_Exercise_12;

import java.util.Scanner;

public class WordGuess_12_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String guessWord = "testing";

		boolean [] arr = new boolean[guessWord.length()];
		boolean flag = true;
		while(flag) {
			System.out.println("Key in one character or your guess word: ");
			String s = sc.next();
			for(int index = 0;index <arr.length;index++) {
				
			}
		}
		sc.close();
	}
}
