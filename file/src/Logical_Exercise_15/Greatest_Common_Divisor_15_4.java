package Logical_Exercise_15;

public class Greatest_Common_Divisor_15_4 {
	
	public static int gcd(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
	public static void main(String[] args) {
		int GreatestCommonElement = gcd(8, 16);
		System.out.println(GreatestCommonElement);
	} 
}
