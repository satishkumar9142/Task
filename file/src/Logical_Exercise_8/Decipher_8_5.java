package Logical_Exercise_8;

import java.util.Scanner;

public class Decipher_8_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ciphertext string: ");
		String word = sc.next().toUpperCase();
		String DecrementByThreeInCharacter = "";
		for(int index =0;index<word.length();index++) {
			DecrementByThreeInCharacter += (char)(word.charAt(index)- 3);
		}
		System.out.println("The plaintext string is: " + DecrementByThreeInCharacter);
		
		sc.close();
	}
}
