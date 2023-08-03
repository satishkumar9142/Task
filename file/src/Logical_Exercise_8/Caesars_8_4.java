package Logical_Exercise_8;

import java.util.Scanner;

public class Caesars_8_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a plaintext string: ");
		String word = sc.next().toUpperCase();
		String IncrementByThreeInCharacter = "";
		for(int index =0;index<word.length();index++) {
			IncrementByThreeInCharacter += (char)(word.charAt(index)+ 3);
		}
		System.out.println("The ciphertext string is: " + IncrementByThreeInCharacter);
	
	sc.close();
	}
}
