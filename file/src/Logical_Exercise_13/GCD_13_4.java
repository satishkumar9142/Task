package Logical_Exercise_13;

public class GCD_13_4 {
	public static void main(String[] args) {
		System.out.println(gcd(675, 835));
	}
	public static int gcd(int a, int b) {
		if( b == 0)return a;
		return gcd(b, a%b);
	}
}
