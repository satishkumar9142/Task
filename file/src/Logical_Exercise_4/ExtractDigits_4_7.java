package Logical_Exercise_4;

public class ExtractDigits_4_7 {
	public static void main(String[] args) {
		
		int number = 15423;
		while(number > 0) {
			System.out.print(number%10 + " ");
			number = number/10;
		}
	}
}
