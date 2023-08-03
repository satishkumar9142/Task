package Logical_Exercise_8;

import java.util.Scanner;

public class Exchange_Cipher_8_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ciphertext string: ");
		String word = sc.next().toUpperCase();
		String exchangeFirstAndLast = "";
		for(int i =0;i<word.length();i++) {
			exchangeFirstAndLast += (char)(64+(26-(word.charAt(i)-'A')));
		}
		System.out.println("The ciphertext string is: "+exchangeFirstAndLast);
		
		sc.close();
	}
}
