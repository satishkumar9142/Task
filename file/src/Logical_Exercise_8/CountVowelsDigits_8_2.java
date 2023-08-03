package Logical_Exercise_8;

import java.util.Scanner;
import java.util.function.Predicate;

public class CountVowelsDigits_8_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String word = sc.nextLine().toLowerCase();
		
		int noOfVowels =0 ;
		int noOfDigits=0;
		Predicate<Character> pre = c->(c == 'a'|| c=='e'||c=='i'||c =='o'|| c=='u');
		for(int index =0;index<word.length();index++) {
			char character = word.charAt(index);
			if(pre.test(character)) {
				noOfVowels++;
			}
			if(Character.isDigit(character)) {
				noOfDigits++;
			}
		}
		double vowlepercentage = (double)(noOfVowels*100)/word.length();
		double digitpercentage = (double)(noOfDigits*100)/word.length();
				
		System.out.printf("Number of vowels: %d  %2f%n", noOfVowels,vowlepercentage);
		System.out.printf("Number of Digits: %d  %2f%n", noOfDigits,digitpercentage);
		
		sc.close();
	}
}
