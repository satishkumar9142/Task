package Logical_Exercise_12;

public class Exponential_Series_12_7 {
	public static void main(String[] args) {
		double exp1 = exp(17);
		System.out.println(exp1);
		
		System.out.println(Math.exp(1));
		
		double exp2 = exp(1, 17);
		System.out.println(exp2);
		
		System.out.println(Math.exp(1));
	}
	public static double exp(int numTerms) {
		double exp = 1.0;
		for(int i =1;i<=numTerms;i++) {
			exp += 1.0/factorial(i);
		}
		return exp;
	}
	public static double exp(double x, int numTerms) {
		double exp = 1.0;
		for(int i =1;i<=numTerms;i++) {
			exp += Math.pow(x, i)/factorial(i);
		}
		return exp;
	}
	public static double factorial(int x) {
		if(x == 1)
			return x;
		return x* factorial(x-1);
	}
}
